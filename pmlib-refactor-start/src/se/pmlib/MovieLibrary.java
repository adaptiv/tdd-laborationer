package se.pmlib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieLibrary {

	private List<Movie> movies = new ArrayList<Movie>();

	public void add(Movie movieToAdd) {
		movies.add(movieToAdd);
	}

	public List<String> renderMoviesByDefaultSort() {
		return renderMovieTable(movies);
	}

	private List<String> renderMovieTable(List<Movie> moviesToRender) {
		List<String> result = new ArrayList<String>();
		result.add(renderHeading());
		result.addAll(renderMovies(moviesToRender));
		return result;
	}

	private List<String> renderMovies(List<Movie> moviesToRender) {
		List<String> result = new ArrayList<String>();		
		for (Movie movie : moviesToRender) {
			result.add(movie.render());
		}
		return result;
	}

	private String renderHeading() {
		return "*********** Movies in Library ***********";
	}

	public List<String> renderMoviesSortedByTitle() {
		List<Movie> sorted = new ArrayList<Movie>(movies);
		Collections.sort(sorted);
		return renderMovieTable(sorted);
	}

}
