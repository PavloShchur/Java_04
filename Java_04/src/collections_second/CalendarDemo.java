package collections_second;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		String months [] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.print("Дата: ");
		System.out.print(months[calendar.get(calendar.MONTH)]);
		System.out.print(" " + calendar.get(calendar.DATE) + " ");
		System.out.println(calendar.get(calendar.YEAR));
		System.out.print("Час: ");
		System.out.print(calendar.get(calendar.HOUR) + ":");
		System.out.print(calendar.get(calendar.MINUTE) + ":");
		System.out.println(calendar.get(calendar.SECOND));
		
		calendar.set(Calendar.HOUR, 10);
		calendar.set(Calendar.MINUTE, 29);
		calendar.set(Calendar.SECOND, 22);
		
		System.out.print("Змінений час: ");
		System.out.print(calendar.get(calendar.HOUR) + ":");
		System.out.print(calendar.get(calendar.MINUTE) + ":");
		System.out.print(calendar.get(calendar.SECOND));
		
		
		
	}

}
