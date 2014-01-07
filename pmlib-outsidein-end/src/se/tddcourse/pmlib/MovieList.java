package se.tddcourse.pmlib;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

	List<Movie> movies = new ArrayList<Movie>();
	
	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public int size() {
		return movies.size();
	}

	public void listMoviesTo(MovieListView view) {
		for (Movie movie : movies) {
			view.renderMovie((Movie) movie.clone());
		}
	}

	public void clear() {
		movies.clear();
	}

}
