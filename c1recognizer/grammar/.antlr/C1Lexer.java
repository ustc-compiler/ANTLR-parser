// Generated from c:\Users\hyt\compile\lab2\c1recognizer\grammar\C1Lexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comma=1, SemiColon=2, Assign=3, LeftBracket=4, RightBracket=5, LeftBrace=6, 
		RightBrace=7, LeftParen=8, RightParen=9, If=10, Else=11, While=12, Const=13, 
		Equal=14, NonEqual=15, Less=16, Greater=17, LessEqual=18, GreaterEqual=19, 
		Plus=20, Minus=21, Multiply=22, Divide=23, Modulo=24, Int=25, Float=26, 
		Void=27, Identifier=28, FloatConst=29, IntConst=30, LineComment=31, BlockComment=32, 
		WhiteSpace=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Comma", "SemiColon", "Assign", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "LeftParen", "RightParen", "If", "Else", "While", "Const", 
		"Equal", "NonEqual", "Less", "Greater", "LessEqual", "GreaterEqual", "Plus", 
		"Minus", "Multiply", "Divide", "Modulo", "Int", "Float", "Void", "Identifier", 
		"IntConst", "FloatConst", "LineComment", "BlockComment", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'='", "'['", "']'", "'{'", "'}'", "'('", "')'", "'if'", 
		"'else'", "'while'", "'const'", "'=='", "'!='", "'<'", "'>'", "'<='", 
		"'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'float'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Comma", "SemiColon", "Assign", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "LeftParen", "RightParen", "If", "Else", "While", "Const", 
		"Equal", "NonEqual", "Less", "Greater", "LessEqual", "GreaterEqual", "Plus", 
		"Minus", "Multiply", "Divide", "Modulo", "Int", "Float", "Void", "Identifier", 
		"FloatConst", "IntConst", "LineComment", "BlockComment", "WhiteSpace"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public C1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C1Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u0097\n\35\f\35\16\35\u009a"+
		"\13\35\3\36\3\36\7\36\u009e\n\36\f\36\16\36\u00a1\13\36\3\36\3\36\7\36"+
		"\u00a5\n\36\f\36\16\36\u00a8\13\36\3\36\3\36\3\36\6\36\u00ad\n\36\r\36"+
		"\16\36\u00ae\5\36\u00b1\n\36\3\37\7\37\u00b4\n\37\f\37\16\37\u00b7\13"+
		"\37\3\37\3\37\6\37\u00bb\n\37\r\37\16\37\u00bc\3\37\6\37\u00c0\n\37\r"+
		"\37\16\37\u00c1\3\37\5\37\u00c5\n\37\3\37\3\37\5\37\u00c9\n\37\3\37\6"+
		"\37\u00cc\n\37\r\37\16\37\u00cd\5\37\u00d0\n\37\3\37\6\37\u00d3\n\37\r"+
		"\37\16\37\u00d4\3\37\3\37\5\37\u00d9\n\37\3\37\6\37\u00dc\n\37\r\37\16"+
		"\37\u00dd\5\37\u00e0\n\37\3 \3 \3 \3 \3 \3 \5 \u00e8\n \3 \3 \3 \5 \u00ed"+
		"\n \3 \7 \u00f0\n \f \16 \u00f3\13 \3 \3 \5 \u00f7\n \3 \5 \u00fa\n \3"+
		" \7 \u00fd\n \f \16 \u0100\13 \7 \u0102\n \f \16 \u0105\13 \3 \5 \u0108"+
		"\n \3 \3 \3 \3 \3!\3!\3!\3!\7!\u0112\n!\f!\16!\u0115\13!\3!\3!\3!\3!\3"+
		"!\3\"\6\"\u011d\n\"\r\"\16\"\u011e\3\"\3\"\3\u0113\2#\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36; =\37?!A\"C#\3\2\r\5"+
		"\2C\\aac|\6\2\62;C\\aac|\3\2\629\3\2\63;\3\2\62;\4\2ZZzz\5\2\62;CHch\4"+
		"\2GGgg\4\2--//\5\2\f\f\17\17^^\5\2\13\f\17\17\"\"\2\u013c\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2"+
		"\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2"+
		"\25W\3\2\2\2\27Z\3\2\2\2\31_\3\2\2\2\33e\3\2\2\2\35k\3\2\2\2\37n\3\2\2"+
		"\2!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'x\3\2\2\2){\3\2\2\2+}\3\2\2\2-\177\3"+
		"\2\2\2/\u0081\3\2\2\2\61\u0083\3\2\2\2\63\u0085\3\2\2\2\65\u0089\3\2\2"+
		"\2\67\u008f\3\2\2\29\u0094\3\2\2\2;\u00b0\3\2\2\2=\u00df\3\2\2\2?\u00ec"+
		"\3\2\2\2A\u010d\3\2\2\2C\u011c\3\2\2\2EF\7.\2\2F\4\3\2\2\2GH\7=\2\2H\6"+
		"\3\2\2\2IJ\7?\2\2J\b\3\2\2\2KL\7]\2\2L\n\3\2\2\2MN\7_\2\2N\f\3\2\2\2O"+
		"P\7}\2\2P\16\3\2\2\2QR\7\177\2\2R\20\3\2\2\2ST\7*\2\2T\22\3\2\2\2UV\7"+
		"+\2\2V\24\3\2\2\2WX\7k\2\2XY\7h\2\2Y\26\3\2\2\2Z[\7g\2\2[\\\7n\2\2\\]"+
		"\7u\2\2]^\7g\2\2^\30\3\2\2\2_`\7y\2\2`a\7j\2\2ab\7k\2\2bc\7n\2\2cd\7g"+
		"\2\2d\32\3\2\2\2ef\7e\2\2fg\7q\2\2gh\7p\2\2hi\7u\2\2ij\7v\2\2j\34\3\2"+
		"\2\2kl\7?\2\2lm\7?\2\2m\36\3\2\2\2no\7#\2\2op\7?\2\2p \3\2\2\2qr\7>\2"+
		"\2r\"\3\2\2\2st\7@\2\2t$\3\2\2\2uv\7>\2\2vw\7?\2\2w&\3\2\2\2xy\7@\2\2"+
		"yz\7?\2\2z(\3\2\2\2{|\7-\2\2|*\3\2\2\2}~\7/\2\2~,\3\2\2\2\177\u0080\7"+
		",\2\2\u0080.\3\2\2\2\u0081\u0082\7\61\2\2\u0082\60\3\2\2\2\u0083\u0084"+
		"\7\'\2\2\u0084\62\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087"+
		"\u0088\7v\2\2\u0088\64\3\2\2\2\u0089\u008a\7h\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7q\2\2\u008c\u008d\7c\2\2\u008d\u008e\7v\2\2\u008e\66\3\2\2\2\u008f"+
		"\u0090\7x\2\2\u0090\u0091\7q\2\2\u0091\u0092\7k\2\2\u0092\u0093\7f\2\2"+
		"\u00938\3\2\2\2\u0094\u0098\t\2\2\2\u0095\u0097\t\3\2\2\u0096\u0095\3"+
		"\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		":\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\7\62\2\2\u009c\u009e\t\4\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00b1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a6\t\5\2\2\u00a3"+
		"\u00a5\t\6\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b1\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7\62\2\2\u00aa\u00ac\t\7\2\2\u00ab\u00ad\t\b\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u009b\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b0\u00a9\3\2"+
		"\2\2\u00b1<\3\2\2\2\u00b2\u00b4\t\6\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ba\7\60\2\2\u00b9\u00bb\t\6\2\2\u00ba\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c5\3\2\2\2\u00be\u00c0\t\6\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\7\60\2\2\u00c4\u00b5\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5\u00cf\3"+
		"\2\2\2\u00c6\u00c8\t\t\2\2\u00c7\u00c9\t\n\2\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\t\6\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00e0\3\2"+
		"\2\2\u00d1\u00d3\t\6\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\t\t"+
		"\2\2\u00d7\u00d9\t\n\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00dc\t\6\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00c4\3\2\2\2\u00df\u00d2\3\2\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7\61\2\2"+
		"\u00e2\u00ed\7\61\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e5\7^\2\2\u00e5\u00e7"+
		"\3\2\2\2\u00e6\u00e8\7\17\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\f\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed"+
		"\7\61\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ed\u00f1\3\2\2\2"+
		"\u00ee\u00f0\n\13\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u0103\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f9\7^\2\2\u00f5\u00f7\7\17\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\7\f\2\2\u00f9\u00f6\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd\n\13\2\2\u00fc\u00fb\3"+
		"\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u00f4\3\2\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0108\7\17\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\f\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\b \2\2\u010c@\3\2\2\2\u010d\u010e\7\61\2\2\u010e\u010f\7,\2\2\u010f"+
		"\u0113\3\2\2\2\u0110\u0112\13\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\7,\2\2\u0117\u0118\7\61\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\b!\2\2\u011aB\3\2\2\2\u011b\u011d\t\f\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\b\"\2\2\u0121D\3\2\2\2\35\2\u0098\u009f\u00a6"+
		"\u00ae\u00b0\u00b5\u00bc\u00c1\u00c4\u00c8\u00cd\u00cf\u00d4\u00d8\u00dd"+
		"\u00df\u00e7\u00ec\u00f1\u00f6\u00f9\u00fe\u0103\u0107\u0113\u011e\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}