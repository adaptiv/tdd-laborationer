package se.tddcourse.pmlib;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

/**
 * Unit specification of {@link ConsoleController} verifying behavior.
 */
public class ConsoleControllerWithMoviesTest {

    private static final String MOVIE_NAME_JAWS = "Jaws";
    private static final String MOVIE_NAME_THE_SHINING = "The Shining";
    
    private Console console;
    private MovieList movieList;
    private ConsoleController controller;
    
    @Before
    public void setupController() {
        movieList = new MovieList();
        movieList.add(new Movie(MOVIE_NAME_JAWS));
        movieList.add(new Movie(MOVIE_NAME_THE_SHINING));
        console = mock(Console.class);
        controller = new ConsoleController(console, movieList);
    }

    @Test
    public void shouldListAllMoviesWithMovieCount() {
        controller.execute(ConsoleController.LIST_ACTION);
        
        InOrder inOrder = inOrder(console);
        inOrder.verify(console).printLine(MOVIE_NAME_JAWS);
        inOrder.verify(console).printLine(MOVIE_NAME_THE_SHINING);
        inOrder.verify(console).printLine(String.format(ConsoleController.FOOTER, 2));
    }
}
