package zooProject;

public class Human extends Creature {

	public String getName() {
		return "������� " + super.getName();
	}



	public void setName(String name) {
		if(name.length() > 10) throw new RuntimeException("Name is too long.");
		super.setName(name);
	}
}
