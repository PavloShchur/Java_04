package collections_second;

import java.util.Calendar;
import java.util.Formatter;

public class FormatDemo6 {

	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		Calendar calendar = Calendar.getInstance();
		
		formatter.format("Today is day %te of %<tB, %<tY", calendar);
		System.out.println(formatter);
		formatter.close();
	}

}
