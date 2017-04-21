package collections_second;

import java.util.Scanner;

public class AvgNums {

	public static void main(String[] args) {
		Scanner conin = new Scanner(System.in);
		
		int count = 0;
		double sum = 0.0;
		
		System.out.println("Введіть числа для підрахунку середнього значення.");
		
		while (conin.hasNextDouble()) {
			if (conin.hasNextDouble()) {
				sum += conin.nextDouble();
				count++;
			}
			else {
				String string = conin.next();
				if (string.equalsIgnoreCase("готово")) break;
				else {
					System.out.println("Помилка форматування даних.");
					return;
				}
			}
		}
		conin.close();
		System.out.println("Середнє число рівне: " + sum / count);
	}

}
