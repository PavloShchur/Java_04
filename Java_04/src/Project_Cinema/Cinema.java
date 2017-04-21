package Project_Cinema;

import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cinema {

	private TreeMap<Days, Schedule> map;
	Schedule schedule = new Schedule();
	Genre my_genre = new Genre();
	Sound_cinema sound_cinema = new Sound_cinema();
	Formatter fmt = new Formatter();

	private static final Time open = new Time(6, 0);
	private static final Time closed = new Time(23, 0);

	public void addDay() {
		for (Days day : Days.values()) {
			map.put(day, new Schedule());
		}
	}

	public void addSchedule_day() {
		System.out.println("Enter day.");
		String name_of_day = Main.scanner.next().toUpperCase();
		Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Days, Schedule> entry = iterator.next();
			if (entry.getKey().name().equals(name_of_day)) {
				System.out.println("Please enter title of movie.");
				String title = Main.scanner.next();
				int hours_duration = 1 + (int) +(Math.random() * 3);
				int minutes_duration = (int) +(Math.random() * 60);
				System.out.println("Please enter time of begining (hour).");
				int hours_begin = Main.scanner.nextInt();
				System.out.println("Please enter time of begining (minutes).");
				int minutes_begin = Main.scanner.nextInt();
				String genre = my_genre.getGenre();
				if ((hours_begin * 60 + minutes_begin < open.getHours() * 60 + open.getMinutes())) {
					System.out.println("Cinema closed at this time");
				} else if (hours_begin * 60 + minutes_begin >= closed.getHours() * 60 + closed.getMinutes()
						| ((hours_duration * 60 + hours_begin * 60 + minutes_duration
								+ minutes_begin)) > (closed.getHours() * 60 + closed.getMinutes())) {
					System.out.println("Cinema closed at this time");
				} else if (entry.getValue().getSchedule().isEmpty()) {
					entry.getValue().getSchedule()
							.add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration), genre),
									new Time(hours_begin, minutes_begin)));
					sound_cinema.playSound_03();
				} else if ((hours_begin * 60
						+ minutes_begin) > (entry.getValue().getSchedule().iterator().next().getEndTime().getHours()
								* 60 + entry.getValue().getSchedule().iterator().next().getEndTime().getMinutes())
						&& ((hours_begin * 60 + minutes_begin
								+ entry.getValue().getSchedule().iterator().next().getMovie().getDuration().getHours()
										* 60
								+ entry.getValue().getSchedule().iterator().next().getMovie().getDuration()
										.getMinutes()) < (entry.getValue().getSchedule().iterator().next().getEndTime()
												.getHours() * 60
												+ entry.getValue().getSchedule().iterator().next().getEndTime()
														.getMinutes()))) {
					System.out.println("Added!");
					entry.getValue().getSchedule()
							.add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration), genre),
									new Time(hours_begin, minutes_begin)));
					sound_cinema.playSound_02();
				} else {
					System.out.println("Time!");
					sound_cinema.playSound_01();
				}
			}
		}
	}

	public void addSchedule_all_days() {
		boolean work = true;
		Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();
		System.out.println("Please enter title of movie.");
		String title = Main.scanner.next();
		int hours_duration = 1 + (int) +(Math.random() * 3);
		int minutes_duration = (int) +(Math.random() * 60);
		System.out.println("Please enter time of begining (hour).");
		int hours_begin = Main.scanner.nextInt();
		System.out.println("Please enter time of begining (minutes).");
		int minutes_begin = Main.scanner.nextInt();
		String genre = my_genre.getGenre();
		while (iterator.hasNext()) {
			Entry<Days, Schedule> entry = iterator.next();
			if ((hours_begin * 60 + minutes_begin < open.getHours() * 60 + open.getMinutes()) & (work)) {
				System.out.println("Cinema closed at this time.");
				work = false;
			} else if (hours_begin * 60 + minutes_begin >= closed.getHours() * 60 + closed.getMinutes()
					| ((hours_duration * 60 + hours_begin * 60 + minutes_duration + minutes_begin)) > (closed.getHours()
							* 60 + closed.getMinutes()) & (work)) {
				System.out.println("Cinema closed at this time.");
				work = false;
			} else if (entry.getValue().getSchedule().isEmpty()) {
				entry.getValue().getSchedule()
						.add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration), genre),
								new Time(hours_begin, minutes_begin)));
			} else if ((hours_begin * 60
					+ minutes_begin) > (entry.getValue().getSchedule().iterator().next().getEndTime().getHours() * 60
							+ entry.getValue().getSchedule().iterator().next().getEndTime().getMinutes())
					|| ((hours_begin * 60 + minutes_begin
							+ entry.getValue().getSchedule().iterator().next().getMovie().getDuration().getHours() * 60
							+ entry.getValue().getSchedule().iterator().next().getMovie().getDuration()
									.getMinutes()) < (entry.getValue().getSchedule().iterator().next().getEndTime()
											.getHours() * 60
											+ entry.getValue().getSchedule().iterator().next().getEndTime()
													.getMinutes()))) {
				System.out.println("Added!");
				entry.getValue().getSchedule()
						.add(new Seance(new Movie(title, new Time(hours_duration, minutes_duration), genre),
								new Time(hours_begin, minutes_begin)));
			} else if (work) {
				System.out.println("Time!" + entry.getKey());

			}
			// work = false;

		}
	}

	public void deleteSeance_day() {
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
					if (seance.getMovie().getTitle().equalsIgnoreCase(title)) {
						iterator2.remove();
					}
				}
			}
		}
	}

	public void deleteSeance_all() {
		Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();
		System.out.println("Please enter title of movie.");
		String title = Main.scanner.next();
		while (iterator.hasNext()) {
			Map.Entry<Days, Schedule> entry = iterator.next();
			Collection<Seance> seances = entry.getValue().getSchedule();
			Iterator<Seance> iterator2 = seances.iterator();
			while (iterator2.hasNext()) {
				Seance seance = iterator2.next();
				if (seance.getMovie().getTitle().equalsIgnoreCase(title)) {
					iterator2.remove();
				}
			}
		}
	}

	public void show_week_schedule() {
		for (Map.Entry<Days, Schedule> entry : map.entrySet()) {
			System.out.println(entry.toString());
		}
	}

	public Cinema(Time open, Time closed) {
		super();
		this.map = new TreeMap<Days, Schedule>();
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

	public Time getClosed() {
		return closed;
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

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

}
