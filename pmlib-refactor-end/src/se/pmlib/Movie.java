package se.pmlib;

public class Movie implements Comparable<Movie> {

	private String title;
	private PersonName director;
	private MinutePeriod length;
	private MpaaRating rating;

	public Movie(String title, String director, int minutes, String rating) {
		this.title = title;
		this.director = new PersonName(director);
		this.length = new MinutePeriod(minutes);
		this.rating = MpaaRating.valueOf(rating);
	}

	public int compareTo(Movie another) {
		return title.compareTo(another.title);
	}

	public String render() {
		StringBuilder builder = new StringBuilder();
		builder.append(title);
		builder.append(" by ");
		builder.append(director.render());
		builder.append(", ");
		builder.append(length.render());
		builder.append(" mins, ");
		builder.append("rated ");
		builder.append(rating.toString());
		return builder.toString();
	}

}
