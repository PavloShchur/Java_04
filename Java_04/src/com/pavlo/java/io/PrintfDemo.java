package com.pavlo.java.io;

public class PrintfDemo {

	public static void main(String[] args) {
		System.out.println("Нижче показані деякі числові значення в різних форматах.");
		System.out.printf("Різні цілочисельні формати:");
		System.out.printf(" %d %(d %+d %05d\n", 3, -3, 3, 3);
		System.out.println();
		System.out.printf("Формат чисел з плаваючою точкою по замовчанню: %f\n", 1234567.123);
		System.out.printf("Формат чисел з плаваючою точкою розділених комою: %,f\n", 1234567.123);
		System.out.printf("Формат відємних чисел з плаваючою точкою по замовчанню: %,f\n", -1234567.123);
		System.out.printf("Інший формат відємних чисел з плаваючою точкою по замовчанню: %(f\n", -1234567.123);
		System.out.println();
		System.out.printf("Вирівнювання додатніх і відємних числових значень:\n");
		System.out.printf("% ,.2f\n% ,.2f\n", 1234567.12, -1234567.12);

	}

}
