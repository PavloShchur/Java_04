package com.pavlo.java.io;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayoutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String s = "Ця стрічка повинна бути введена в масив.";
		byte [] buf = s.getBytes();
		
		try {
			f.write(buf);
		} catch (Exception e) {
			System.out.println("Помилка запису в буфер.");
			return;
		}
		System.out.println("Буфер у вигляді символьної стрічки.");
		System.out.println(f.toString());
		System.out.println("В масив.");
		byte [] b = f.toByteArray();
		for (int i = 0; i < b.length; i++) System.out.print((char) b[i]);
		System.out.println("\nВ потік виводу типу OutputStream().");
		try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
			f.writeTo(f2);
		} catch (IOException e) {
			System.out.println("Помилка вводу-виводу " + e);
			return;
		}
		
		System.out.println("Повернення у вихідне положення");
		f.reset();
		
		for (int i = 0; i<3; i++) f.write('X');
		System.out.println(f.toString());
		
	}
	

}
