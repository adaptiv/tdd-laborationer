package se.tddcourse.pmlib;


public interface MovieListView {

	String view();

	void addFooter(int numberOfMovies);

	void renderMovie(Movie movie);

}
