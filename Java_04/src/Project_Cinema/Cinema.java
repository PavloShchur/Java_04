package Project_Cinema;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cinema {
	private TreeMap<Days, Schedule> map;
	Schedule schedule = new Schedule();
	private Time open;
	private Time closed;
	private Days days;

	public void addDay() {
		System.out.println("Enter day.");
		String name_of_day = Main.scanner.next().toUpperCase();
		for (Days day : Days.values()) {
			if (name_of_day.equalsIgnoreCase(day.name())) {
				map.put(day, new Schedule());
			}
		}

	}

	public void addSchedule() {
		System.out.println("Enter day.");
		String name_of_day = Main.scanner.next().toUpperCase();
		Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Days, Schedule> entry = iterator.next();
			if (entry.getKey().name().equals(name_of_day)) {
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
				if (entry.getValue().getSchedule().isEmpty()) {
					entry.getValue().getSchedule()
							.add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration)),
									new Time(hours_begin, minutes_begin)));
				} else if ((hours_begin >= entry.getValue().getSchedule().iterator().next().getEndTime().getHours()
						&& minutes_begin > entry.getValue().getSchedule().iterator().next().getEndTime().getMinutes())
						|| (hours_begin + entry.getValue().getSchedule().iterator().next().getMovie().getDuration()
								.getHours()) < entry.getValue().getSchedule().iterator().next().getEndTime().getHours()
								&& (minutes_begin + entry.getValue().getSchedule().iterator().next().getMovie()
										.getDuration().getMinutes() < entry.getValue().getSchedule().iterator().next()
												.getEndTime().getMinutes())) {
					entry.getValue().getSchedule()
							.add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration)),
									new Time(hours_begin, minutes_begin)));
					System.out.println("Wrong time!");
				} else {
					System.out.println("Time!");
				}

			}
			// schedule.getSchedule().add(new Seance(new Movie(title, new
			// Time(hours_duration, minutes_duration)),
			// new Time(hours_begin, minutes_begin)));
		}
	}

	public void deleteSeance() {
		System.out.println("Enter day.");
		String name_of_day = Main.scanner.next().toUpperCase();
		Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Days, Schedule> entry = iterator.next();
			if (entry.getKey().name().equals(name_of_day)) {
				System.out.println("Please enter title of movie.");
				String title = Main.scanner.next();
				// System.out.println("Please enter hours.");
				// int hours_begin = Main.scanner.nextInt();
				// System.out.println("Please enter minutes.");
				// int minutes_duration = Main.scanner.nextInt();
				Collection<Seance> seances = entry.getValue().getSchedule();
				Iterator<Seance> iterator2 = seances.iterator();
				while (iterator2.hasNext()) {
					Seance seance = iterator2.next();
					if (seance.getMovie().getTitle().equalsIgnoreCase(title))

					// & seance.getStartTime().equals((hours_begin))
					// & seance.getStartTime().equals(minutes_duration))
					{
						iterator2.remove();
					}

				}
			}
		}
	}

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
		Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Days, Schedule> entry = iterator.next();
			if ((hours_begin > entry.getValue().getSchedule().iterator().next().getEndTime().getHours()
					&& minutes_begin > entry.getValue().getSchedule().iterator().next().getEndTime().getMinutes())
					|| (hours_begin
							+ schedule.getSchedule().iterator().next().getMovie().getDuration().getHours()) < entry
									.getValue().getSchedule().iterator().next().getEndTime().getHours()
							&& (minutes_begin + schedule.getSchedule().iterator().next().getMovie().getDuration()
									.getMinutes() < entry.getValue().getSchedule().iterator().next().getEndTime()
											.getMinutes())) {
				System.out.println("Wrong time!");
			} else {
				System.out.println("Time!");
				schedule.getSchedule().add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration)),
						new Time(hours_begin, minutes_begin)));
			}

		}
	}

	// System.out.println("Enter day.");
	// String name_of_day = Main.scanner.next().toUpperCase();
	// Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();
	// while (iterator.hasNext()) {
	// Map.Entry<Days, Schedule> entry = iterator.next();
	// if (entry.getKey().name().equals(name_of_day)) {
	// entry.getValue().addSeance();
	// }
	// }
	// }
	//
	public void show_week_schedule() {
		for (Map.Entry<Days, Schedule> entry : map.entrySet()) {
			System.out.println(entry.toString());
		}
	}

	public void addMovie(Movie movie, Time time) {
		if (time.getHours() < open.getHours()
				|| (time.getHours() + movie.getDuration().getHours()) > closed.getHours()) {
			System.out.println("Time error.");
		} else {

		}

	}

	public Cinema(Time open, Time closed) {
		super();
		this.map = new TreeMap<Days, Schedule>();
		this.open = open;
		this.closed = closed;
	}

	public Cinema(TreeMap<Days, Schedule> map, Set<Entry<Days, Schedule>> set) {
		super();
		this.map = map;
	}

	public TreeMap<Days, Schedule> getMap() {
		return map;
	}

	public void setMap(TreeMap<Days, Schedule> map) {
		this.map = map;
	}

	public Time getOpen() {
		return open;
	}

	public void setOpen(Time open) {
		this.open = open;
	}

	public Time getClosed() {
		return closed;
	}

	public void setClosed(Time closed) {
		this.closed = closed;
	}

	@Override
	public String toString() {
		return "Cinema [map=" + map + ", open=" + open + ", closed=" + closed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((closed == null) ? 0 : closed.hashCode());
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		result = prime * result + ((open == null) ? 0 : open.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cinema other = (Cinema) obj;
		if (closed == null) {
			if (other.closed != null)
				return false;
		} else if (!closed.equals(other.closed))
			return false;
		if (days != other.days)
			return false;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		if (open == null) {
			if (other.open != null)
				return false;
		} else if (!open.equals(other.open))
			return false;
		return true;
	}

}
