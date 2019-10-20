cmake_minimum_required(VERSION 3.5)

add_definitions(-DFULL_IMPL)

set_property(DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}
       PROPERTY EP_UPDATE_DISCONNECTED 1)

list(APPEND CMAKE_MODULE_PATH ${CMAKE_CURRENT_SOURCE_DIR}/cmake)

# compiler must be 11 or 14
set(CMAKE_CXX_STANDARD 14)

# set variable pointing to the antlr tool that supports C++
#set(ANTLR_EXECUTABLE "NOT-FOUND" CACHE STRING "ANTLR v4 JAR file location. Used by antlr4cpp.")
set(ANTLR4CPP_JAR_LOCATION "NOT-FOUND" CACHE STRING "ANTLR v4 JAR file location. Used by antlr4cpp.")

# add macros to generate ANTLR Cpp code from grammar
find_package(ANTLR REQUIRED)

# Call macro to add lexer and grammar to your build dependencies.
antlr4cpp_process_grammar(c1_recognizer c1_recognizer
  ${CMAKE_CURRENT_SOURCE_DIR}/grammar/C1Lexer.g4
  ${CMAKE_CURRENT_SOURCE_DIR}/grammar/C1Parser.g4)

# include generated files in project environment
include_directories(${antlr4cpp_include_dirs_c1_recognizer})

include_directories(${CMAKE_CURRENT_SOURCE_DIR}/include)
# add antrl4cpp artifacts to project environment
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/include/antlr4-runtime)

# add generated grammar to c1_recognizer binary target
add_library(c1recognizer
  src/error_listener.cpp
  src/error_reporter.cpp
  src/syntax_tree.cpp
  src/syntax_tree_builder.cpp
  src/recognizer.cpp
  ${antlr4cpp_src_files_c1_recognizer})
add_dependencies(c1recognizer antlr4cpp_generation_c1_recognizer)
target_link_libraries(c1recognizer antlr4-runtime)

include_directories(${rapidjson_include_dirs})
add_executable(c1r_test test/main.cpp)
add_dependencies(c1r_test c1recognizer)
target_link_libraries(c1r_test c1recognizer)

install(
  TARGETS c1recognizer
  RUNTIME DESTINATION bin
  LIBRARY DESTINATION lib
  ARCHIVE DESTINATION lib)

install(DIRECTORY include/c1recognizer DESTINATION include)

configure_file(c1recognizer-config.cmake.in c1recognizer-config.cmake @ONLY)

install(FILES ${CMAKE_CURRENT_BINARY_DIR}/c1recognizer-config.cmake DESTINATION cmake)
