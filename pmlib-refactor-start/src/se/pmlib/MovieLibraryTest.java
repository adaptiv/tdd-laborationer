package se.pmlib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MovieLibraryTest {

	private static final int FIRST_MOVIE_ROW = 1;
	private final static Movie MOVIE_JAWS = new Movie("Jaws", "Steven Spielberg", 115, "R");
	private final static Movie MOVIE_ET = new Movie("E.T.", "Steven Spielberg", 122, "PG");

	private MovieLibrary movieLibrary;

	@Before
	public void setupLibrary() {
		movieLibrary = new MovieLibrary();
		movieLibrary.add(MOVIE_JAWS);
		movieLibrary.add(MOVIE_ET);		
	}

	@Test
	public void shouldRenderAllMovies() throws Exception {
		assertEquals("Jaws by Steven Spielberg, 115 mins, rated R", movieLibrary.renderMoviesByDefaultSort().get(FIRST_MOVIE_ROW));
	}

	@Test
	public void shouldRenderAllMoviesSortedByTitle() throws Exception {
		assertEquals("E.T. by Steven Spielberg, 122 mins, rated PG", movieLibrary.renderMoviesSortedByTitle().get(FIRST_MOVIE_ROW));	
	}
	
}
