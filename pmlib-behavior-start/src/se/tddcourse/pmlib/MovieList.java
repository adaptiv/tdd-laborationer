package se.tddcourse.pmlib;

import java.util.ArrayList;
import java.util.List;

/**
 * List of movies.
 */
public class MovieList {

    private List<Movie> movies = new ArrayList<Movie>();

    /**
     * Determines the number of movies in the collection.
     *
     * @return number of registered movies
     */
    public int numberOfMovies() {
        return movies.size();
    }

    /**
     * Determines if movie list is empty.
     *
     * @return true if no movies in container, false otherwise
     */
    public boolean isEmpty() {
        return movies.isEmpty();
    }

    /**
     * Adds a new movies to the collection.
     *
     * @param movie a movie
     */
    public void add(Movie movie) {
        movies.add(movie);
    }

}
