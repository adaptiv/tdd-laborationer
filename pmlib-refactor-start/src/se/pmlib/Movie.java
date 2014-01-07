package se.pmlib;

public class Movie implements Comparable<Movie> {

	private String title;
	private String director;
	private int lengthInMinutes;
	private String mpaaRating;

	public Movie(String title, String director, int minutes, String rating) {
		this.title = title;
		this.director = director;
		this.lengthInMinutes = minutes;
		this.mpaaRating = rating;
	}

	public int compareTo(Movie another) {
		return title.compareTo(another.getTitle());
	}
	
	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getLengthInMinutes() {
		return lengthInMinutes;
	}

	public String getMpaaRating() {
		return mpaaRating;
	}

	public String render() {
		StringBuilder builder = new StringBuilder();
		builder.append(getTitle());
		builder.append(" by ");
		builder.append(getDirector());
		builder.append(", ");
		builder.append(getLengthInMinutes());
		builder.append(" mins, ");
		builder.append("rated ");
		builder.append(getMpaaRating());
		return builder.toString();
	}

}
