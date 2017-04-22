package programming_basics;

import java.util.Currency;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ATM {

	static short My_Balance = 10000;
	static short Another_Balance = 10000;
	static short Pin = 1234;
	static Scanner src = new Scanner(System.in);
	
	int count = 0;

	public static void main(String[] args) {
		ATM atm = new ATM();
		boolean work = true;
		atm.pin();
		while (work) {
			String choice = src.next();
			switch (choice) {
			case "1":
				atm.my_balance();;
				break;
			case "2":
				atm.withdraw();
				break;
			case "3":
				atm.set();
				break;
			case "4":
				atm.transaction();
				break;
			case "5":
				System.exit(0);
				break;
			default:
				System.out.println("Please make Your choice.");
				break;
			}// switch
		} // while
	}// main


	public void menu() {
		System.out.println("Enter 1 for showing balance");
		System.out.println("Enter 2 for withdrawing money");
		System.out.println("Enter 3 for setting money");
		System.out.println("Enter 4 for making a trnzaction");
		System.out.println("Enter 5 for EXIT");
	}
	
	public void pin() {
		System.out.println("Please enter Your pin.");
		int user_pin = src.nextInt();
		if (Pin == user_pin) {
			menu();
		} else if (count < 4) {
			count++;
			pin();
		} else {
			System.out.println("EXIT");
			return;
		}
	}
	
	public void withdraw () {
		System.out.println("Enter sum which You want to withdraw.");
		short sum_withdraw = src.nextShort();
		if (sum_withdraw <= My_Balance) {
			My_Balance -= sum_withdraw;
		} else {
			System.out.println("Sorry, but You do not have enough money.");
			my_balance();
		}
	}
	
	public void set () {
		System.out.println("Enter sum which You want to set");
		short sum_set = src.nextShort();
		if (sum_set <= 10000) {
			My_Balance += sum_set;
		} else {
			System.out.println("Sorry, but the max sum which you can to set is 10000 USD");
		}
	}
	
	public void transaction () {
		System.out.println("Enter name of person to whom You want to sent money.");
		System.out.println("Enter sum of money.");
		short sum_transaction = src.nextShort();
		if (sum_transaction <= My_Balance) {
			try {
				Another_Balance += sum_transaction;
				another_balance();
			} catch (InputMismatchException e) {
				
			}
		} else if (sum_transaction <= 10000) {
			Another_Balance += sum_transaction;
			another_balance();
		} else {
			System.out.println("Sorry, but the max sum which you can send is 10000 USD");
			return;
		}
	}
	

	public void my_balance() {
		Currency currency;
		currency = Currency.getInstance(Locale.US);
		System.out.println("Your balance is: " + My_Balance + " " + currency.getSymbol());
	}
	
	public void another_balance () {
		Currency currency;
		currency = Currency.getInstance(Locale.US);
		System.out.println("Another balance is: /n" + My_Balance + " " + currency.getSymbol());
	}

}
