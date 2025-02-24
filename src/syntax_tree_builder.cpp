
#include "c1recognizer/syntax_tree.h"
#include <any>
#include <c1recognizer/syntax_tree_builder.h>
#include <memory>
#include <vector>

using namespace c1_recognizer;
using namespace c1_recognizer::syntax_tree;

template<typename T>
auto as_syntax_tree(T* node) {
    return ptr<syntax_tree_node>(static_cast<syntax_tree_node*>(node));
}

syntax_tree_builder::syntax_tree_builder(error_reporter &_err) : err(_err) {}

antlrcpp::Any syntax_tree_builder::visitCompilationUnit(C1Parser::CompilationUnitContext *ctx)
{
    auto res = new assembly;
    return as_syntax_tree(res);
}

antlrcpp::Any syntax_tree_builder::visitDecl(C1Parser::DeclContext *ctx)
{
    return VisitResult(new var_def_stmt_syntax);
}

antlrcpp::Any syntax_tree_builder::visitConstdecl(C1Parser::ConstdeclContext *ctx)
{
    return VisitResult(new var_def_stmt_syntax);
}

antlrcpp::Any syntax_tree_builder::visitConstdef(C1Parser::ConstdefContext *ctx)
{
    return VisitResult(new var_def_stmt_syntax);
}

antlrcpp::Any syntax_tree_builder::visitVardecl(C1Parser::VardeclContext *ctx)
{
    return VisitResult(new var_def_stmt_syntax);
}

antlrcpp::Any syntax_tree_builder::visitVardef(C1Parser::VardefContext *ctx)
{
    return VisitResult(new var_def_stmt_syntax);
}

antlrcpp::Any syntax_tree_builder::visitFuncdef(C1Parser::FuncdefContext *ctx)
{
    return VisitResult(new func_def_syntax);
}

antlrcpp::Any syntax_tree_builder::visitBlock(C1Parser::BlockContext *ctx)
{
    return VisitResult(new block_syntax);
}

antlrcpp::Any syntax_tree_builder::visitStmt(C1Parser::StmtContext *ctx)
{
    return VisitResult(new empty_stmt_syntax);
}

antlrcpp::Any syntax_tree_builder::visitLval(C1Parser::LvalContext *ctx)
{
    return VisitResult(new lval_syntax);
}

antlrcpp::Any syntax_tree_builder::visitCond(C1Parser::CondContext *ctx)
{
    return VisitResult(new unaryop_expr_syntax);
}

// Returns antlrcpp::Any, which is std::any.
// You should be sure you use the same type for packing and depacking the `Any` object.
// This function always returns an `Any` object containing a `expr_syntax *`.
antlrcpp::Any syntax_tree_builder::visitExp(C1Parser::ExpContext *ctx)
{
    // Get all sub-contexts of type `exp`.
    auto expressions = ctx->exp();
    // Two sub-expressions presented: this indicates it's a expression of binary operator, aka `binop`.
    if (expressions.size() == 2)
    {
        auto result = new binop_expr_syntax;
        // Set line and pos.
        result->line = ctx->getStart()->getLine();
        result->pos = ctx->getStart()->getCharPositionInLine();
        // visit(some context) is equivalent to calling corresponding visit method; dispatching is done automatically
        // by ANTLR4 runtime. For this case, it's equivalent to visitExp(expressions[0]).
        // Use reset to set a new pointer to a std::shared_ptr object. DO NOT use assignment; it won't work.
        // Use `as<Type>(std::any)' to get value from antlrcpp::Any object; notice that this Type must match the type used in
        // constructing the Any object, which is constructed from (usually pointer to some derived class of
        // syntax_node, in this case) returning value of the visit call.
        result->lhs.reset((*this)(expressions[0]).as_node<expr_syntax*>());
        // Check if each token exists.
        // Returnd value of the calling will be nullptr (aka NULL in C) if it isn't there; otherwise non-null pointer.
        if (ctx->Plus())
            result->op = binop::plus;
        if (ctx->Minus())
            result->op = binop::minus;
        if (ctx->Multiply())
            result->op = binop::multiply;
        if (ctx->Divide())
            result->op = binop::divide;
        if (ctx->Modulo())
            result->op = binop::modulo;
        result->rhs.reset((*this)(expressions[1]).as_node<expr_syntax*>());
    }
    // Otherwise, if `+` or `-` presented, it'll be a `unaryop_expr_syntax`.
    if (ctx->Plus() || ctx->Minus())
    {
        auto result = new unaryop_expr_syntax;
        result->line = ctx->getStart()->getLine();
        result->pos = ctx->getStart()->getCharPositionInLine();
        if (ctx->Plus())
            result->op = unaryop::plus;
        if (ctx->Minus())
            result->op = unaryop::minus;
        result->rhs.reset((*this)(expressions[0]).as_node<expr_syntax*>());
        return VisitResult(result);
    }
    // In the case that `(` exists as a child, this is an expression like `'(' expressions[0] ')'`.
    if (ctx->LeftParen())
        return visit(expressions[0]); // Any already holds expr_syntax* here, no need for dispatch and re-patch with casting.
    // If `number` exists as a child, we can say it's a literal integer expression.
    if (auto number = ctx->number())
        return visit(number);
    return VisitResult(nullptr);
}

antlrcpp::Any syntax_tree_builder::visitNumber(C1Parser::NumberContext *ctx)
{
    auto result = new literal_syntax;
    if (auto intConst = ctx->IntConst())
    {
        result->is_int = true;
        result->line = intConst->getSymbol()->getLine();
        result->pos = intConst->getSymbol()->getCharPositionInLine();
        auto text = intConst->getSymbol()->getText();
        if (text[0] == '0' && (text[1] == 'x' || text[1] == 'X')) // Hexadecimal
            result->intConst = std::stoi(text, nullptr, 16); // std::stoi will eat '0x'
        /* you need to add other situations here */
        
        return VisitResult(result);
    }
    // else FloatConst
    return VisitResult(result);
}

VisitResult syntax_tree_builder::operator()(antlr4::tree::ParseTree *ctx)
{
    auto res = visit(ctx);
    return std::any_cast<VisitResult>(res);
}
