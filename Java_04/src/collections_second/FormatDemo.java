package collections_second;

import java.util.Formatter;

public class FormatDemo {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		fmt.format("Форматувати %s дуже просто: %d %f", "засобами Java", 10, 98.6);
		System.out.println(fmt);
		fmt.close();
	}

}
