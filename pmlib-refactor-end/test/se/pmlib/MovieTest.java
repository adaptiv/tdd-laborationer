package se.pmlib;

import static org.junit.Assert.*;

import org.junit.Test;


public class MovieTest {

	@Test
	public void shouldBeRenderable() throws Exception {
		Movie movie = new Movie("Jaws", "Steven Spielberg", 115, "R");
		assertEquals("Jaws by Steven Spielberg, 115 mins, rated R", movie.render());
	}
}
