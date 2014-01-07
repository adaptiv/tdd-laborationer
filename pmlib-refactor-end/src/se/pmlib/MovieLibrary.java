package se.pmlib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieLibrary {

	private List<Movie> movies = new ArrayList<Movie>();

	public void add(Movie movieToAdd) {
	    if (movieToAdd == null) {
	        throw new IllegalArgumentException("cannot add null movie");
	    }

	    movies.add(movieToAdd);
	}
	
	public List<String> renderMovieLibrary() {
		return renderMovieTable(movies);
	}

	private List<String> renderMovieTable(List<Movie> moviesToRender) {
		List<String> result = new ArrayList<String>();
		result.add(renderHeading());
		result.addAll(renderMovies(moviesToRender));
		return result;
	}

	private String renderHeading() {
		return "*********** Movies in Library ***********";
	}

	private List<String> renderMovies(List<Movie> moviesToRender) {
		List<String> result = new ArrayList<String>();
		for (Movie movie : moviesToRender) {
			result.add(movie.render());
		}
		return result;
	}

	public List<String> renderLibrarySortedByTitle() {
		return renderMovieTable(sortMoviesByTitle(movies));
	}
	
	private List<Movie> sortMoviesByTitle(List<Movie> moviesToSort) {
		List<Movie> sorted = new ArrayList<Movie>(moviesToSort);
		Collections.sort(sorted);
		return sorted;
	}

}
