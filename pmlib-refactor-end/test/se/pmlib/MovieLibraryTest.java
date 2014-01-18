package se.pmlib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MovieLibraryTest {

	private static final int FIRST_MOVIE_INDEX = 1;
	private MovieLibrary movieLibrary;

	@Before
	public void createLibrary() {
		movieLibrary = new MovieLibrary();
		movieLibrary.add(new Movie("Jaws", "Steven Spielberg", 115, "R"));
		movieLibrary.add(new Movie("E.T.", "Steven Spielberg", 122, "PG"));
	}

	@Test
	public void shouldRenderItsMovies() throws Exception {
		assertEquals("Jaws by Steven Spielberg, 115 mins, rated R", movieLibrary.renderMovieLibrary().get(FIRST_MOVIE_INDEX));
	}

	@Test
	public void shouldRenderItsMoviesSortedByTitle() throws Exception {
		assertEquals("E.T. by Steven Spielberg, 122 mins, rated PG", movieLibrary.renderLibrarySortedByTitle().get(FIRST_MOVIE_INDEX));	
	}
	
	@Test(expected=IllegalArgumentException.class)
    public void shouldRejectAdditionOfNullMovie() throws Exception {
        movieLibrary.add(null);
    }
}
