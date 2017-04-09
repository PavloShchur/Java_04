package Project_Cinema;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule{
	private Set<Seance> schedule;

	public void addSeance() {
		System.out.println("Please enter title of movie.");
		String title = Main.scanner.next();
		System.out.println("Please enter hours.");
		int hours_duration = Main.scanner.nextInt();
		System.out.println("Please enter minutes.");
		int minutes_duration = Main.scanner.nextInt();
		System.out.println("Please enter time of begining (hour).");
		int hours_begin = Main.scanner.nextInt();
		System.out.println("Please enter time of begining (minutes).");
		int minutes_begin = Main.scanner.nextInt();
		
//		if(schedule.iterator().next().getEndTime().getMinutes() > 59)
//		   {
//		    int hours = schedule.iterator().next().getEndTime().getHours();
//		    int mins = schedule.iterator().next().getEndTime().getMinutes();
//		    hours = hours + 1;
//		    mins = mins - 60;
//		    schedule.iterator().next().setEndTime(new Time(hours, mins));
//		   }
		schedule.add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration)), new Time(hours_begin, minutes_begin)));
		System.out.println(schedule);
		
		
	}

	public void deleteSeance () {
		System.out.println("Enter name of movie");
		String name_of_movie = Main.scanner.next();
		Iterator<Seance> iterator = schedule.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getMovie().getTitle().equalsIgnoreCase(name_of_movie))
			iterator.remove();
		}
	}

	public Schedule() {
		super();
		this.schedule = new TreeSet<Seance>();
	}

	public Set<Seance> getSchedule() {
		return schedule;
	}


	public void setSchedule(Set<Seance> schedule) {
		this.schedule = schedule;
	}

	
	@Override
	public String toString() {
		return schedule.toString();
	}
	

}
