package collections_second;

import java.util.Formatter;

public class LeftJustify {

	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		
		formatter.format("|%10.2f|", 123.123);
		System.out.println(formatter);
		formatter.close();
		
		formatter = new Formatter();
		formatter.format("|%-10.2f|", 123.123);
		System.out.println(formatter);
		formatter.close();
	}

}
