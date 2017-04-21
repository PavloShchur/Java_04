package collections_second;

import java.util.Formatter;

public class FormatDemo1 {

	public static void main(String[] args) {
		
		try (Formatter formatter = new Formatter()) {
			formatter.format("Форматування %s просо %d %f", " засобаи Java", 10, 98.6);
			System.out.println(formatter);
		}
	}

}
