package com.srini.algorithm;

import org.junit.Test;

public class PermutateStringTest {

	private PermutateString permutateString;

	public PermutateStringTest() {
		permutateString = new PermutateString();
	}

	@Test
	public void testPermutateString() {
		permutateString.permutate("", "abc");
	}
}
