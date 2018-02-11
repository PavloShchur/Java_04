package councilProject_2;

import java.util.Scanner;

public class Deputat extends Human {
	Scanner scanner = new Scanner(System.in);

	Bribe bribe = new Bribe(amountOfBribe = scanner.nextInt());
			
	private String surname;
	private String name;
	private int years;
	private boolean briber;
	private int amountOfBribe;
	public Deputat(int weight, int height, String surname, String name, int years, boolean briber) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.years = years;
		this.briber = briber;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public boolean isBriber() {
		return briber;
	}
	public void setBriber(boolean briber) {
		this.briber = briber;
	}
	public int getAmountOfBribe() {
		return amountOfBribe;
	}
	public void setAmountOfBribe(int amountOfBribe) {
		this.amountOfBribe = amountOfBribe;
	}
	public void addbribe() {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		if(briber == false) {
			System.out.println("Цей дупутат не бере хабаря");
		} else if (amount > 5000) {
			System.out.println("Міліція увязнить депутата");
		} else if (amount < 5000) {
			setAmountOfBribe(amount);
		}
	}
	
}
