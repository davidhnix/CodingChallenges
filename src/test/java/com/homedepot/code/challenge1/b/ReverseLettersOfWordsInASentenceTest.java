package com.homedepot.code.challenge1.b;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ReverseWordsInASentenceTest</code> contains tests for the class <code>{@link ReverseLettersOfWordsInASentence}</code>.
 *
 * @generatedBy CodePro at 6/15/16 8:04 PM
 * @author dnl0rot
 * @version $Revision: 1.0 $
 */
public class ReverseLettersOfWordsInASentenceTest {
	
	@Test
	public void testReverseWords()
		throws Exception {
		String input = "Reverse me!";

		String result = ReverseLettersOfWordsInASentence.reverseLettersOfWordsInThisSentence(input);

		// add additional test code here
		assertEquals("esreveR !em", result);
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReverseLettersOfWordsInASentenceTest.class);
	}
}