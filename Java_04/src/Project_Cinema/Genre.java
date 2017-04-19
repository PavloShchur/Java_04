package Project_Cinema;

public class Genre {
	String[] genres = { "genre_01", "genre_02", "genre_03", "genre_04" };
	int gnere_choice = (int) (Math.random() * genres.length);
	String genre = genres[gnere_choice];
	
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	public int getGnere_choice() {
		return gnere_choice;
	}
	public void setGnere_choice(int gnere_choice) {
		this.gnere_choice = gnere_choice;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Genre() {
		super();
	}
	
	
	

}
