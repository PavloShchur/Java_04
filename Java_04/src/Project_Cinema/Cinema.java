package Project_Cinema;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cinema {
	private TreeMap<Days, Schedule> map;

	Time open;
	Time closed;
	Days days;	

	public void addDay() {
		System.out.println("Enter day.");
		String name_of_day = Main.scanner.next().toUpperCase();
		for (Days day : Days.values()) {
			if (name_of_day.equalsIgnoreCase(day.name())){
				map.put(day, new Schedule());
				System.out.println(map);
			} 
//			else {
////				System.out.println("Day is not correct.");
//			}
		}

	}
	
	public void addSchedule () {
		System.out.println("Enter day.");
		String name_of_day = Main.scanner.next().toUpperCase();
		System.out.println(map);
		Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Days, Schedule> entry = iterator.next();
			if (entry.getKey().name().equals(name_of_day)) {
				System.out.println("QQQQQQQQ");
				entry.getValue().addSeance();
			}
		}
	}
	
	public void show_week_schedule () {
		for (Map.Entry<Days, Schedule> entry : map.entrySet()) {
			System.out.println(entry);
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

}
