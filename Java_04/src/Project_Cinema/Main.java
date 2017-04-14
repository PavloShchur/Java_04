package Project_Cinema;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Cinema cinema = new Cinema(new Time(06, 30), new Time(20, 00));
		Schedule schedule = new Schedule();
		boolean work = true;
		while (work) {
			Menu menu = new Menu();
			menu.menu();
			String choice = Main.scanner.next();

			switch (choice) {
			case "1":
				cinema.addDay();
				cinema.addSchedule_day();
				break;
			case "2":
				cinema.addSchedule_all_days();
				break;
			case "3":
				cinema.show_week_schedule();
				break;
			case "4":
				cinema.deleteSeance();
				break;
			case "5":
				System.exit(0);

			}
		}

	}

}
