package com.arkvis.jlox;

public class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    // TODO In our final interpreter we should also add column and length too for better error reporting
    // Some interpreters only calculate line and column if there's an error as this is faster.
    // They store the offset from the beginning of the file and the length of the lexeme.
    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    @Override
    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
