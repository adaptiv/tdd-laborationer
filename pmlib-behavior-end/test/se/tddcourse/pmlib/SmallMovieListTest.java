package se.tddcourse.pmlib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit specification of a small {@link MovieList}.
 */
public class SmallMovieListTest {

    private final static Movie MOVIE_THE_SHINING = createMovieNamed("The Shining");
    private final static Movie MOVIE_JAWS = createMovieNamed("Jaws");
    private final static Movie MOVIE_DELIVERANCE = createMovieNamed("Deliverance");
    private MovieList movieList;
    
    /**
     * Creates movie with given title.
     *
     * @param title movie title
     * @return created movie
     */
    private static Movie createMovieNamed(String title) {
        return new Movie(title);
    }

    @Before
    public void setUp() throws Exception {
        movieList = createSmallMovieList(MOVIE_DELIVERANCE, MOVIE_JAWS, MOVIE_THE_SHINING);
    }

    /**
     * Creates list of movies of arbitrary size.
     *
     * @param movies variable number of movies
     * @return list of given movies
     */
    private MovieList createSmallMovieList(Movie... movies) {
        MovieList movieList = new MovieList();
        for (Movie movie : movies) {
            movieList.add(movie);
        }
        return movieList;
    }

    @Test
    public void shouldIndicateNumberOfMovies() {
        assertEquals(3, movieList.numberOfMovies());   
    }

    @Test
    public void shouldContainAllAddedMovies() {
        List<Movie> expectedTitles = Arrays.asList(
                new Movie[] {createMovieNamed("Deliverance"),
                             createMovieNamed("Jaws"),
                             createMovieNamed("The Shining")});
        assertListsOfMoviesEquals(expectedTitles, movieList);
    }

    /**
     * Asserts that all movies in expectedMovies are present in actualMovies.
     * 
     * @param expectedMovies
     * @param actualMovies
     */
    private void assertListsOfMoviesEquals(List<Movie> expectedMovies, MovieList actualMovies) {
        assertEquals(expectedMovies.size(), actualMovies.numberOfMovies());
        for (Movie movie : expectedMovies) {
            assertTrue(actualMovies.contains(movie));
        }
    }

}
