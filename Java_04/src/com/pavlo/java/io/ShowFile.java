package com.pavlo.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		int i;
		if (args.length != 1) {
			System.out.println("Використання: ShowFile імя файлу ");
			return;
		}
		try (FileInputStream fin = new FileInputStream(args[0])) {

			do {
				i = fin.read();
				if (i != -1)
					System.out.println((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("Файл не знайдено.");
		} catch (IOException e) {
			System.out.println("Помилка вводу-виводу");
		}
	}

}
