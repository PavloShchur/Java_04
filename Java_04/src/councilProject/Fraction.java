package councilProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Fraction {
	private String FractionName;



	public Fraction(String fractionName) {
		super();
		FractionName = fractionName;
	}
	
	

	public String getFractionName() {
		return FractionName;
	}

	public void setFractionName(String fractionName) {
		FractionName = fractionName;
	}

	

	List<Deputy> deputies = new ArrayList<>();

	public void addDepatat() {
		List<Deputy> deputies = new ArrayList<>();
		System.out.println("Enter name");
		String name = Main.scanner.next();
		System.out.println("Enter surname");
		String surname = Main.scanner.next();
		System.out.println("Enter years");
		int years = Main.scanner.nextInt();
		System.out.println("Enter height");
		int height = Main.scanner.nextInt();
		System.out.println("Enter weight");
		int weight = Main.scanner.nextInt();
		System.out.println("Is deputy briber? Enter yes or not");
		boolean briber = false;
		String answer = Main.scanner.next();
		if (answer.equalsIgnoreCase("yes")) {
			briber = true;
		} else if (answer.equalsIgnoreCase("no")) {
			briber = false;
		}
		Deputy deputy = new Deputy(weight, height, surname, name, years, briber);
		deputy.addbribe();
		deputies.add(deputy);
	}

	public void deleteDepatat() {
		System.out.println("Enter name");
		String name = Main.scanner.next();
		System.out.println("Enter surname");
		String surname = Main.scanner.next();
		ArrayList<Deputy> list = new ArrayList<Deputy>();
		Iterator<Deputy> iterator = list.iterator();
		while (iterator.hasNext()) {
			Deputy rDeputy = iterator.next();
			if (name.equals(rDeputy.getName()) && surname.equals(rDeputy.getSurname())) {
				iterator.remove();
				break;
			}
		}

	}

	public void showAllBribers() {
		for (int i = 0; i < deputies.size(); i++) {
			if (deputies.get(i).isBriber() == true && deputies.get(i).getAmountOfBribe() != 0) {
				System.out.println(deputies.get(i).getName());
			} System.out.println(deputies.get(i).getName());
		}
	}

	public void showBiggestBriber() {
		ArrayList<Deputy> list = new ArrayList<Deputy>();
		Iterator<Deputy> iterator = list.iterator();
		int DeputyBiggest = 0;
		String Depute = "";
		for (int i = 0; i < deputies.size(); i++) {
			if (deputies.get(i).getAmountOfBribe() > DeputyBiggest) {
				DeputyBiggest = deputies.get(i).getAmountOfBribe();
				Depute = deputies.get(i).getName() + " " + deputies.get(i).getSurname();
			}
		}
		System.out.println(Depute + " найбільший хабарник");

	}

	public void showAllDeputies() {
		for(int i = 0; i < deputies.size(); i++) {
			System.out.println(deputies.get(i).getName());

		}
	}

	
	@Override
	public String toString() {
		return FractionName;
	}

	public void deleteAllDeputes() {
		deputies.removeAll(deputies);
		// for (int i = 0; i < deputies.size(); i++) {
		// System.out.println(deputies.remove(i));
		// System.out.println("The fracion is empty");
		// }

	}

}