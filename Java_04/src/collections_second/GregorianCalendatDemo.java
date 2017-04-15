package collections_second;

import java.util.GregorianCalendar;

public class GregorianCalendatDemo {

	public static void main(String[] args) {
		String months [] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int year;
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.print("Дата: ");
		System.out.print(months[calendar.get(calendar.MONTH)]);
		System.out.print(" " + calendar.get(calendar.DATE) + " ");
		System.out.println(year = calendar.get(calendar.YEAR));
		System.out.print("Час: ");
		System.out.print(calendar.get(calendar.HOUR) + ":");
		System.out.print(calendar.get(calendar.MINUTE) + ":");
		System.out.println(calendar.get(calendar.SECOND));
		
		if(calendar.isLeapYear(year)) {
			System.out.println("Цей рік високосний.");
		} else {
			System.out.println("Цей рік не високосний.");

		}
	}

}
