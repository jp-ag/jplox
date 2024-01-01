package com.craftinginterpreters.lox;
import java.util.Objects;

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line){
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }
    //currently not comparing lines, because they are used for error reporting    
    @Override
    public boolean equals(Object obj){
	if (this == obj){return true;}
	if (obj == null || getClass() != obj.getClass()){return false;}
	Token token = (Token) obj;
	return type == token.type &&
	       lexeme.equals(token.lexeme)  &&
	       Objects.equals(literal, token.literal);
    }

    public String toString(){
        if(literal == null){return "Type: " + type + " Lexeme: " + lexeme + " Literal and literal class: " + literal + " null";}
	return "Type: " + type + " Lexeme: " + lexeme + " Literal and literal class" + literal + " " + literal.getClass();
    }
}
