package se.tddcourse.pmlib;

import java.util.ArrayList;
import java.util.List;

/**
 * List of movies.
 */
public class MovieList {

    private List<Movie> movies = new ArrayList<Movie>();

    /**
     * Creates empty movie list.
     */
    public MovieList() {
    }

    /**
     * Creates movie list, adding provided movie to the library.
     *
     * @param movie movie to add
     */
    MovieList(Movie movie) {
        movies.add(movie);
    }

    /**
     * Creates movie list, adding provided movies to the library.
     *
     * @param movies movies to add
     */
    MovieList(List<Movie> movies) {
        this.movies.addAll(movies);
    }

    /**
     * Determines the number of movies in the collection.
     *
     * @return number of registered movies
     */
    public int numberOfMovies() {
        return movies.size();
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
