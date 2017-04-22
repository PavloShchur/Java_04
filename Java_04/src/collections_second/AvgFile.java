package collections_second;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvgFile {

	public static void main(String[] args) throws IOException {
		int count = 0;
		double sum = 0.0;

		FileWriter fout = new FileWriter("test.txt");
		fout.write("2, 3.4, 5, 6, 7.4, 9.1, 10.2, good");
		fout.close();

		FileReader fin = new FileReader("test.txt");
		
		try (Scanner src = new Scanner(fin)) {
			src.useDelimiter(", *");
			while (src.hasNext()) {
				if (src.hasNextDouble()) {
					sum += src.nextDouble();
					count++;
				} else {
					String str = src.next();
					if (str.equals("good"))
						break;
					else {
						System.out.println("Помилка формату файлу.");
						return;
					}
				}
			}
		}
		System.out.println("Середнє число рівне: " + sum / count);
	}

}
