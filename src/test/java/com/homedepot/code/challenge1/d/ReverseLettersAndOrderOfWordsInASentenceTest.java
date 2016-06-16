package com.homedepot.code.challenge1.d;

import org.junit.*;

import com.homedepot.code.challenge1.c.ReverseOrderOfWordsInASentence;

import static org.junit.Assert.*;

/**
 * The class <code>ReverseLettersAndOrderOfWordsInASentenceTest</code> contains tests for the class <code>{@link ReverseLettersAndOrderOfWordsInASentence}</code>.
 *
 * @generatedBy CodePro at 6/15/16 10:10 PM
 * @author davidnix
 * @version $Revision: 1.0 $
 */
public class ReverseLettersAndOrderOfWordsInASentenceTest {
	
	@Test
	public void testReverseLettersAndOrderOfWordsInASentence(){
		String input = "Reverse the words of this sentence.";
		
		String result = ReverseLettersAndOrderOfWordsInASentence.reverseLettersAndOrderOfWordsInThisSentence(input);
		
		assertEquals(".ecnetnes siht fo sdrow eht esreveR", result);
	}
	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReverseLettersAndOrderOfWordsInASentenceTest.class);
	}
}