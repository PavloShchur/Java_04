package com.pavlo.java.io;

import java.io.Console;

public class ConsoleDemo {
	public static void main (String args[]) {
		String str;
		Console c;
		c = System.console();
		if (c == null) return;
		
		str = c.readLine("¬вед≥ть стр≥чку: ");
		c.printf("¬ведена ¬ами стр≥чка: %s\n", str);
		
	}
}
