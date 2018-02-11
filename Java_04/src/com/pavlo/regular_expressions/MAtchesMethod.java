package com.pavlo.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MAtchesMethod {
	
	private static final String REGEX = "foo";
	private static final String INPUT = "foooooooooooooo";
	private static Pattern pattern;
	private static Matcher matcher;

	public static void main(String[] args) {
		pattern = Pattern.compile(REGEX);
		matcher = pattern.matcher(INPUT);
		
		System.out.println("Current REDEX is: " + REGEX);
		System.out.println("Current INPUT is: " + INPUT);
		
		System.out.println("lookingAt(): " + matcher.lookingAt());
		System.out.println("matches(): " + matcher.matches());
		
	}

}
