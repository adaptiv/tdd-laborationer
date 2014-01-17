package se.pmlib;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieLibraryTest {

    @Test
    public void shouldProvideAllMoviesInLibrary() throws Exception {
        Movie jaws = new Movie("Jaws", "Steven Spielberg", 115, "R");
        Movie et = new Movie("E.T.", "Steven Spielberg", 122, "PG");

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.add(jaws);
        movieLibrary.add(et);
        assertEquals("Jaws by Steven Spielberg, 115 mins, rated R", movieLibrary.getMovies().get(1));
    }

    @Test
    public void shouldProvideAllMoviesInLibrarySortedByTitle() throws Exception {
        Movie jaws = new Movie("Jaws", "Steven Spielberg", 115, "R");
        Movie et = new Movie("E.T.", "Steven Spielberg", 122, "PG");

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.add(jaws);
        movieLibrary.add(et);
        assertEquals("E.T. by Steven Spielberg, 122 mins, rated PG", movieLibrary.getMoviesByTitle().get(1));
    }

}
