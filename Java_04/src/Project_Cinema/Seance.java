package Project_Cinema;

public class Seance {
	private Movie movie;
	private Time startTime;
	private Time endTime;
	
	

public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
	}

//	public Seance(Movie movie, Time startTime) {
//		super();
//		this.movie = movie;
//		this.startTime = startTime;
//		this.endTime = new Time((startTime.getHours() + movie.getDuration().getHours()),
//				(startTime.getMinutes() + movie.getDuration().getMinutes()));
//	}

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
	public String toString() {
		return "Seance [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
