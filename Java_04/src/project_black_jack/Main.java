package project_black_jack;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Casino casino = new Casino();
		boolean work = true;
		while (work) {
			Menu menu = new Menu();
			menu.menu();
			String choice = Main.scanner.next();

			switch (choice) {
			case "1":
				casino.add_player();
				break;
			case "2":
				casino.add_cards();
				break;
			case "3":
				casino.show_table();
				break;
			case "4":
				break;

			}

		}
	}
}
