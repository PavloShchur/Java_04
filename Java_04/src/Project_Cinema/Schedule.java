package Project_Cinema;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
	private Set<Seance> seances;

	public void addSeance() {
		System.out.println("Please enter title of movie.");
		String title = Main.scanner.next();
		System.out.println("Please enter hours.");
		int hours = Main.scanner.nextInt();
		System.out.println("Please enter minutes");
		int minutes = Main.scanner.nextInt();
		seances.add(new Seance(new Movie(title, new Time(hours, minutes)), new Time(hours, minutes)));
	}
	  
	
	public void deleteSeance () {
		System.out.println("Enter name of movie");
		String name_of_movie = Main.scanner.next();
		Iterator<Seance> iterator = seances.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getMovie().getTitle().equalsIgnoreCase(name_of_movie))
			iterator.remove();
		}
	}

	public Schedule() {
		super();
		this.seances = new TreeSet<Seance>();
	}

}
