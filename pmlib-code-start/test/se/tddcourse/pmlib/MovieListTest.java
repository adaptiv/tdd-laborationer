package se.tddcourse.pmlib;

import static org.junit.Assert.*;

import org.junit.Test;


public class MovieListTest {

	@Test
	public void emptyMovieListShouldBeOfSizeZero() throws Exception {
		MovieList movieList = new MovieList();
		assertEquals(0, movieList.size());
	}
	
	@Test
	public void addingAMovieShouldIncreaseSizeByOne() throws Exception {
		MovieList movieList = new MovieList(); //DRY
		movieList.add(new Movie());
		assertEquals(1, movieList.size());
	}
	
}
