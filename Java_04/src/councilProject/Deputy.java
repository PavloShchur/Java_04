package councilProject;


public class Deputy extends Human {

	private String surname;
	private String name;
	private int years;
	private boolean briber;
	private int amountOfBribe;

	public Deputy(int weight, int height, String surname, String name, int years, boolean briber) {
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

	@Override
	public String toString() {
		return "Deputy [surname - " + surname + ", name - " + name + ", years - " + years + ", briber - " + briber
				+ "]";
	}

	public void addbribe() {
		if (briber == false) {
			System.out.println("Цей дупутат не бере хабаря");
		} else {
			System.out.println("Enter number of money...");
			int money = Main.scanner.nextInt();
			if (money > 5000) {
				System.out.println("Міліція увязнила депутата");
			} else if (money > 0) {
				amountOfBribe = amountOfBribe + money;
			}
		}
	}

}
