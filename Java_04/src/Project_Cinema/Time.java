package Project_Cinema;

import java.util.Comparator;

public class Time implements Comparator<Time> {
	private int hours;
	private int minutes;

	public Time(int hours, int minutes) {
		if (minutes < 0 | minutes > 59) {
			System.out.println("Wrong minutes");
		} else {
			this.minutes = minutes;
		}
		if (hours < 0 | hours > 23) {
			System.out.println("Wrong hours");
		} else {
			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes < 0 | minutes > 59) {
			System.out.println("Wrong minutes");
		} else {
			this.minutes = minutes;
		}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 0 | hours > 23) {
			System.out.println("Wrong hours");
		} else {
			this.hours = hours;
		}
	}

	@Override
	public String toString() {
		if (minutes > 60) {
			return hours + 1 + ":" + (minutes - 60);
		} else {
			return hours + ":" + minutes;
		}
	}

	public int compare(Time o) {
		if (this.hours > o.hours) {
			return 1;
		} else if (this.hours < o.hours) {
			return -1;
		} else if (this.minutes > o.minutes) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int compare(Time o1, Time o2) {
		if (o2.hours > o1.hours) {
			return 1;
		} else if (o2.hours < o1.hours) {
			return -1;
		} else if (o2.minutes > o1.minutes) {
			return 1;
		} else {
			return 0;
		}
	}

}
