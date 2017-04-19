package Project_Cinema;

public class Movie {
	private String title;
	private String genre;
	private Time Duration;
	public Movie(String title, Time Duration, String genre) {
		super();
		this.title = title;
		this.Duration = Duration;
		this.genre = genre;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", Duration=" + Duration + "]";
	}
	
	
	
	
	
	
	
}
