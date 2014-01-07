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

    private Movie theShiningMovie;
    private Movie jawsMovie;
    private Movie deliveranceMovie;
    private MovieList movieList;
    
    @Before
    public void setUp() throws Exception {
        deliveranceMovie = createMovieNamed("Deliverance");
        jawsMovie = createMovieNamed("Jaws");
        theShiningMovie = createMovieNamed("The Shining");
        movieList = createSmallMovieList(deliveranceMovie, jawsMovie, theShiningMovie);
    }

    /**
     * Creates movie with given title.
     *
     * @param title movie title
     * @return created movie
     */
    private Movie createMovieNamed(String title) {
        return new Movie(title);
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
                new Movie[] {deliveranceMovie, jawsMovie, theShiningMovie});
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
