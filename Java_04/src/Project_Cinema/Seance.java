package Project_Cinema;

public class Seance implements Comparable<Seance> {
	private Movie movie;
	private Time startTime;
	private Time endTime;
	
public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
		endTime = new Time(startTime.getHours() + movie.getDuration().getHours(), 
				startTime.getMinutes() + movie.getDuration().getMinutes());
	}

	
	@Override
public String toString() {
		if(getEndTime().getMinutes() > 59)
		   {
		    int hours = getEndTime().getHours();
		    int mins = getEndTime().getMinutes();
		    hours = hours + 1;
		    mins = mins - 60;
		    setEndTime(new Time(hours, mins));
		   }
	return "Seance [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + "]";
}


	public Movie getMovie() {
	return movie;
}


public void setMovie(Movie movie) {
	this.movie = movie;
}


public Time getStartTime() {
	return startTime;
}


public void setStartTime(Time startTime) {
	this.startTime = startTime;
}


public Time getEndTime() {
	return endTime;
}


public void setEndTime(Time endTime) {
	this.endTime = endTime;
}




	@Override
	public int compareTo(Seance o) {
		if (!this.startTime.equals(startTime)) {
			return -1;
		} else
			return 0;
	}

}
