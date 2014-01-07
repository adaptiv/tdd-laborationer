package se.tddcourse.pmlib;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Unit specification of {@link ConsoleController} verifying behavior.
 */
public class ConsoleControllerWithNoMoviesTest {
    
    @Mock private Console console;
    @Mock private MovieList movieList;
    private ConsoleController controller;
    
    @Before
    public void setupController() {
    	MockitoAnnotations.initMocks(this);
        controller = new ConsoleController(console, movieList);
    }

    @Test
    public void shouldIndicateIfListingEmptyMovieList() {
    	when(movieList.isEmpty()).thenReturn(true);
        controller.execute(ConsoleController.LIST_ACTION);
		verify(console).printLine(ConsoleController.MESSAGE_EMPTY_MOVIE_COLLECTION);
    }
}
