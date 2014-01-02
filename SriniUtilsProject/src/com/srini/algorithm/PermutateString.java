package com.srini.algorithm;

public class PermutateString {

	void permutate(String prefix, String actual) {
		if (null == actual || actual.length() == 0)
			System.out.println(prefix);
		for (int i = 0; i < actual.length(); i++) {
			permutate(prefix + actual.charAt(i), actual.substring(0, i)
					+ actual.substring(i + 1));
		}
	}
}
