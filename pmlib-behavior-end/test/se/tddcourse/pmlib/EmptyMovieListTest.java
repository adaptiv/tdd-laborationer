package se.tddcourse.pmlib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit specification of an empty {@link MovieList}.
 */
public class EmptyMovieListTest {

    MovieList movieList;

    @Before
    public void setupEmptyMovieList() {
        movieList = new MovieList();        
    }

    @Test
    public void shouldContainNoMovies() {
        assertEquals(0, movieList.numberOfMovies());
    }

    @Test
    public void shouldBeEmpty() {
        assertTrue(movieList.isEmpty());
    }

    @Test
    public void canAddFirstMovieToList() {
        Movie jaws = new Movie("Jaws");
        movieList.add(jaws);
        assertEquals(1, movieList.numberOfMovies());
        assertFalse(movieList.isEmpty());
    }
    
    @Test
    @SuppressWarnings("unused")
    public void shouldBeIterableButNoElements() {
        for (Movie movie : movieList) {
            fail("should be empty");
        }
    }

}
