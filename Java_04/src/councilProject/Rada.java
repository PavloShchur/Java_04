package councilProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.omg.Messaging.SyncScopeHelper;

public class Rada {
	static ArrayList<Fraction> fractions = new ArrayList<>();

	String name;
	
	
	List<Deputy> deputies = new ArrayList<>();


	public void addFraction() {
		System.out.println("Enter name of fraction");
		String fractionName = Main.scanner.next();
		Fraction fraction = new Fraction(fractionName);
		fractions.add(fraction);
		System.out.println(fraction);
		
		


	}
	

	public  void allFractions() {
//		System.out.println(fractions.toString() + name);


		System.out.println(fractions.toString());
//		for (int i = 0; i < fractions.size(); i++) {
//			System.out.println(fractions.get(i).getFractionName() + name);
//		}

//			
			
			
			
			
			
			
			
			
//				
//			}
			
		}
	
	
//	
//	animals.add(new Animal("dog", 2));
//	animals.add(new Animal("cat", 3));
//	animals.add(new Animal("frog", 1));
//	animals.add(new Animal("aligator", 5));
//	
//	ListIterator<Animal> listIterator = animals.listIterator(animals.size());
//	
//	while(listIterator.hasPrevious()){
////		System.out.println(listIterator.previous());
//		if(listIterator.previous().getName().equals("frog")){
//			listIterator.set(new Animal("some", 123));
//		}
//	}
//	
//	System.out.println(animals);
//	

	public void deleteFraction() {
		System.out.println("Enter name of fraction which you want to delete");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFractionName())) {
				fractions.remove(i);
				break;
			}
		}
	}

	public void showFraction() {
		System.out.println("Enter name of fraction which you want to show");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFractionName())) {
				System.out.println(fractions.get(i));
			}
		}
	}
	public void addAnDeputyToConcreteFraction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFractionName())) {
				fractions.get(i).addDepatat();
			}
		}
	}
	public void showAllBribersInFraction() {
		System.out.println("Enter name of fraction1");
		String name = Main.scanner.next();
		for(int i = 0; i < fractions.size(); i++) {
				if (name.equalsIgnoreCase(fractions.get(i).getFractionName())) {
					fractions.get(i).showAllBribers();
					System.out.println();
				}
		}
	}
	public void deleteDeputy() {
		System.out.println("Enter name of fraction which you want to delete");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFractionName())) {
//				System.out.println("Enter name of deputy which you want to delete");
//				String nameOfDeputy = Main.scanner.next();
//				System.out.println("Enter surname of deputy which you want to delete");
//				String surnameOfDeputy = Main.scanner.next();
//				if(nameOfDeputy.equalsIgnoreCase(fractions.get(i).deputies.get(i).getName()) && surnameOfDeputy
//						.equalsIgnoreCase(fractions.get(i).deputies.get(i).getSurname())) {
//					fractions.get(i).deleteDepatat();
//				}
				fractions.get(i).deleteDepatat();

			}
		}
	}

	public void biggestBribeInFaction() {
		int DeputyBiggest = 0;
		String Depute = "";
		for (int i = 0; i < fractions.size(); i++) {
			if (fractions.get(i).deputies.get(i).getAmountOfBribe() > DeputyBiggest) {
				DeputyBiggest = fractions.get(i).deputies.get(i).getAmountOfBribe();
				Depute = fractions.get(i).deputies.get(i).getName() + " " + fractions.get(i).deputies.get(i).getSurname();
			}
		}
		System.out.println(Depute + " найбільший хабарник");

	}
	@Override
	public String toString() {
		return name + "qwqwqw";
	}
}
	


