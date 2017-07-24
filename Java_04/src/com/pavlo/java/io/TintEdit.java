package com.pavlo.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TintEdit {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		System.out.println("¬вед≥ть стр≥чки тексту.");
		System.out.println("¬ведеть 'стоп' дл€ завершенн€.");
		for (int i = 0; i < 100; i++) {
			str[i] = br.readLine();
			if(str[i].equals("стоп")) break;
		}
		System.out.println("\n¬м≥ст вашого файлу:");
		for (int i = 0; i < 100; i++) {
			if(str[i].equals("стоп")) break;
			System.out.println(str[i]);
		}
	}

}
