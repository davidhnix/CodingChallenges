package com.homedepot.code.challenge1.a;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ReverseAStringTest</code> contains tests for the class <code>{@link ReverseAString}</code>.
 *
 * @generatedBy CodePro at 6/15/16 8:01 PM
 * @author dnl0rot
 * @version $Revision: 1.0 $
 */
public class ReverseAStringTest {

	@Test
	public void testReverse() throws Exception {
		String input = "Reverse this String!";

		String result = ReverseAString.reverse(input);

		// add additional test code here
		assertEquals("!gnirtS siht esreveR", result);
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReverseAStringTest.class);
	}
}