package collections_second;

import java.util.Scanner;

public class AvgNums {

	public static void main(String[] args) {
		Scanner conin = new Scanner(System.in);
		
		int count = 0;
		double sum = 0.0;
		
		System.out.println("������ ����� ��� ��������� ���������� ��������.");
		
		while (conin.hasNextDouble()) {
			if (conin.hasNextDouble()) {
				sum += conin.nextDouble();
				count++;
			}
			else {
				String string = conin.next();
				if (string.equalsIgnoreCase("������")) break;
				else {
					System.out.println("������� ������������ �����.");
					return;
				}
			}
		}
		conin.close();
		System.out.println("������ ����� ����: " + sum / count);
	}

}
