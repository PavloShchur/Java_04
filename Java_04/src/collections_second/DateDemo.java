package collections_second;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		long msec = date.getTime();
		System.out.println("Кількість мілісекунд, що пройшли з 1 січня 1970 року по Грінвічу складає: " + msec);
	}

}
