package se.tddcourse.pmlib;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit specification of a small {@link MovieList}.
 */
public class SmallMovieListTest {

    private static final Movie MOVIE_THE_SHINING = new Movie("The Shining");
    private static final Movie MOVIE_JAWS = new Movie("Jaws");
    private static final Movie MOVIE_DELIVERANCE = new Movie("Deliverance");

    private MovieList movieList;
    
    @Before
    public void setUp() throws Exception {
        movieList = new MovieList();
        movieList.add(MOVIE_DELIVERANCE);
        movieList.add(MOVIE_JAWS);
        movieList.add(MOVIE_THE_SHINING);
    }

    @Test
    public void shouldIndicateNumberOfMovies() {
        assertEquals(3, movieList.numberOfMovies());   
    }

    @Test
    public void shouldContainAllAddedMovies() {
        List<String> expectedTitles = Arrays.asList(
                new String[] {MOVIE_DELIVERANCE.getTitle(),
                        MOVIE_JAWS.getTitle(),
                        MOVIE_THE_SHINING.getTitle()});
        assertAllMoviesPresent(expectedTitles);
    }

    private void assertAllMoviesPresent(List<String> expectedTitles) {
        for (Iterator<Movie> movieIterator = movieList.iterator(); movieIterator.hasNext();) {
            final String movieTitle = movieIterator.next().getTitle();
            assertTrue(expectedTitles.contains(movieTitle));
        }
    }

}
