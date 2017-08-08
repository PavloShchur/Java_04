package com.pavlo.parallel.programming;

public class SrialNumberGenerator {
	
	private static volatile int serileNumber = 0;
	public static int nextSerialNumber() {
		return serileNumber++;
	}

}
