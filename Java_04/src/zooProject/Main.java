package zooProject;

public class Main {
	public static void main(String args[]) {
		Creature b = new Mushroom();
		b.setName("Name");
		
		Creature child = b.reproduce();
		System.out.println(b.getName());
		
		Creature c = new Human();
		c.setName("Name_2");
		
		Creature child_2 = c.reproduce();
		System.out.println(c.getName());
//		((Bird)child).fly();
		
		String a_1 = "В лісі є яЛинка";
		String a_2 = "В Лісі є ялинка";

	}
	
}
