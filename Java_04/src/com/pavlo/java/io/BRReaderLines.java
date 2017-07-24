package com.pavlo.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReaderLines {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("¬вед≥ть стрчки текстуЇ.");
		System.out.println("¬вед≥ть 'стоп' дл€ завершенн€.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("стоп"));
	}

}
