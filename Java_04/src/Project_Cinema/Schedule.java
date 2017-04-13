package Project_Cinema;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class Schedule {
	private Set<Seance> schedule;
	Cinema cinema;

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
		schedule.add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration)),
				new Time(hours_begin, minutes_begin)));
	}

	public void deleteSeance() {
		System.out.println("Enter day.");
		String name_of_day = Main.scanner.next().toUpperCase();
		Iterator<Entry<Days, Schedule>> iterator = cinema.getMap().entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Days, Schedule> entry = iterator.next();
			if (entry.getKey().name().equals(name_of_day)) {
				System.out.println("Please enter title of movie.");
				String title = Main.scanner.next();
				System.out.println("Please enter hours.");
				int hours_begin = Main.scanner.nextInt();
				System.out.println("Please enter minutes.");
				int minutes_duration = Main.scanner.nextInt();
				Collection<Seance> seances = entry.getValue().getSchedule();
				Iterator<Seance> iterator2 = seances.iterator();
				while (iterator2.hasNext()) {
					Seance seance = iterator2.next();
					if (seance.getMovie().toString().equalsIgnoreCase(title) & seance.getStartTime().equals((hours_begin))
							& seance.getStartTime().equals(minutes_duration)) {
						iterator2.remove();
					}

				}
			}
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

	public Schedule(Set<Seance> schedule) {
		super();
		this.schedule = schedule;
	}

}
