package com.homedepot.code.challenge1.c;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ReverseWordsOfASentenceTest</code> contains tests for the class <code>{@link ReverseOrderOfWordsInASentence}</code>.
 *
 * @generatedBy CodePro at 6/15/16 8:06 PM
 * @author dnl0rot
 * @version $Revision: 1.0 $
 */
public class ReverseOrderOfWordsOfASentenceTest {
	
	@Test
	public void testReverseTheseWords_1() throws Exception {
		String input = "Reverse the words of this sentence.";

		String result = ReverseOrderOfWordsInASentence.reverseOrderOfWordsInThisSentence(input);

		// add additional test code here
		assertEquals("sentence. this of words the Reverse", result);
	}
	

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReverseOrderOfWordsOfASentenceTest.class);
	}
}