package se.tddcourse.pmlib;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

	private List<Movie> movies = new ArrayList<Movie>();

	public int size() {
		return movies.size();
	}

	public void add(Movie movie) {
		movies.add(movie);
	}

}
