package Project_Cinema;

public class Movie {
	private String title;
	private Time Duration;
	public Movie(String title, Time time) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Time getDuration() {
		return Duration;
	}
	public void setDuration(Time duration) {
		Duration = duration;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", Duration=" + Duration + "]";
	}
	
	
	
	
}
