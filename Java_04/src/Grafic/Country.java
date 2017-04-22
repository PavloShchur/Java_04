package Grafic;

public class Country {
	private String name;
	private int population;
	
	String[] theString;
	int[] theInt;
	
	

	public String[] getTheString() {
		return theString;
	}

	public void setTheString(String[] theString) {
		this.theString = theString;
	}

	public int[] getTheInt() {
		return theInt;
	}

	public void setTheInt(int[] theInt) {
		this.theInt = theInt;
	}

	public Country(String[] theString, int[] theInt) {
		super();
		this.theString = theString;
		this.theInt = theInt;
	}

	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	public 
	
	
	
	
	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}

}
