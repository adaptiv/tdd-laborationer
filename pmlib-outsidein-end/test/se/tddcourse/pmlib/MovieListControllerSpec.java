package se.tddcourse.pmlib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class MovieListControllerSpec {

	private MovieListController controller;
	private MovieList collection;
	private MovieListView listView;
	
	
	@Before
	public void createControllerWithEmptyCollection() {
		collection = new MovieList();
		controller = new MovieListController(collection);
		listView = mock(MovieListView.class);
		controller.setListView(listView);
	}
	
	@Test
	public void shouldApplyListViewToCollectionWhenListing() {
		controller.list();
		verify(listView).addFooter(0);
	}
	
	@Test
	public void shouldAddMoviesToCollection() {
		controller.addMovie("Jaws");
		assertEquals(1, collection.size());
	}
	
	@Test
	public void shouldListAllMoviesInCollection() {
		controller.addMovie("Jaws");
		controller.list();
		verify(listView).renderMovie(any(Movie.class));
		verify(listView).addFooter(1);
	}
	
}
