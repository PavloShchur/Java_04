package com.pavlo.Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {

		String longString = " Some Name BC 1234 AH (067)123-1234 oltenwebpetro@gmail.com";
		String strangeString = "12 aaa *** ** * {{{ {{ {";
		String ipString = "255.255.255.0";
		
//		regExcToCheck("\\s[A-Za-z]{2,20}", longString);
		
//		regExcToCheck("\\s\\d{4}\\s", longString);
//		regExcToCheck("[a-zA-Z]", longString);
//		regExcToCheck("B[CHA]|A[HAI]", longString); // BC AH 
//		regExcToCheck("(\\{{1,})", strangeString); // {{{ {{ {
//		regExcToCheck("(\\{+)", strangeString);// {{{ {{ { 
//		regExcToCheck(".{3}", strangeString);//12 aaa ** * * * * {{ { { { { 
//		regExcToCheck("\\w*", strangeString);// 12 aaa 
//		regExcToCheck("[A-Za-z0-9._\\%-]+@[A-Za-z0-9._\\%-]+\\.[A-Za-z]{2,4}", longString);
		
		// check ip address
		regExcToCheck("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ 	   "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+      "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+      "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$", ipString);
		

	}

	public static void regExcToCheck(String regExc, String stringToCheck) {
		Pattern pattern = Pattern.compile(regExc);
		Matcher matcher = pattern.matcher(stringToCheck);
		while (matcher.find()) {
			if (matcher.group().length() != 0) {
				System.out.print(matcher.group().trim() + " ");
			}
		}
	}
}
