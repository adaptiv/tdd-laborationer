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
			
}
