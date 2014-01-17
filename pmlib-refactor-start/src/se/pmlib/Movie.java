package se.pmlib;

public class Movie implements Comparable<Movie> {

    private String title;
    private String director;
    private int minutes;
    private String rating;

    public Movie(String title, String name, int minutes, String rating) {
        this.title = title;
        this.director = name;
        this.minutes = minutes;
        this.rating = rating;
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

    public int getLength() {
        return minutes;
    }

    public String getRating() {
        return rating;
    }

}
