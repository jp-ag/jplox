package com.craftinginterpreters.lox;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;


public class ScannerTest {

    @Test
    public void testSingleLineCommentHandling() {
        // Test code for handling single-line comments
	Scanner scanner = new Scanner("var // test comment int");
	List<Token> scannedList = new ArrayList<>(scanner.scanTokens());
	List<Token> tokenList =  new ArrayList<>();
	tokenList.add(new Token(TokenType.VAR, "var", null, 1 ));
	tokenList.add(new Token(TokenType.EOF, "", null, 2 ));
	System.out.println(scannedList);
	System.out.println(tokenList);
	System.out.println("Scanned List Class: " + scannedList.getClass());
	System.out.println("Token List Class: " + tokenList.getClass());
	System.out.println("Lists Are Equal: " + scannedList.equals(tokenList));
	assertEquals(scannedList, tokenList);	 
   }

    @Test
    public void testMultiLineCommentHandling() {
        // Test code for handling multi-line comments
    }

    @Test
    public void testKeywordTokenization() {
        // Test code for tokenizing keywords (e.g., if, while)
    }

    @Test
    public void testBooleanLiteralTokenization() {
        // Test code for tokenizing boolean literals (true, false)
    }

    @Test
    public void testStringLiteralTokenization() {
        // Test code for tokenizing string literals
    }

    @Test
    public void testSpecialCharacterTokenization() {
        // Test code for tokenizing special characters (e.g., +, -, *, /)
    }

    @Test
    public void testCombinedScenarios() {
        // Test code with a combination of different tokens and scenarios
    }

    @Test
    public void testComplexInput() {
        // Test code with a more complex input string
    }

    // Add more test methods as needed

}
