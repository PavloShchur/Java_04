package collections_second;

import java.util.Formatter;

public class FormatDemo5 {

	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		
		formatter.format("% d", -100);
		System.out.println(formatter);
		formatter.close();
		
		formatter = new Formatter();
		formatter.format("% d", 100);
		System.out.println(formatter);
		formatter.close();
		
		formatter = new Formatter();
		formatter.format("% d", -200);
		System.out.println(formatter);
		formatter.close();
		
		formatter = new Formatter();
		formatter.format("% d", 200);
		System.out.println(formatter);
		formatter.close();
	}

}
