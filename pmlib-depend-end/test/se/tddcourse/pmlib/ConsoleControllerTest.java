package se.tddcourse.pmlib;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit specification of {@link ConsoleController}.
 */
public class ConsoleControllerTest {

    private static final String MOVIE_NAME_JAWS = "Jaws";
    private static final String MOVIE_NAME_THE_SHINING = "The Shining";

    private ConsoleController controller;
    private ConsoleRecorder consoleStub;
    private MovieList movieList;

    @Before
    public void setupControllerWithMovieListAndConsole() {
        consoleStub = new ConsoleRecorder();
        movieList = new MovieList();
        controller = new ConsoleController(consoleStub, movieList);
    }

    @Test
    public void shouldListAllMoviesWithTotalCount() {
        movieList.add(new Movie(MOVIE_NAME_JAWS));
        movieList.add(new Movie(MOVIE_NAME_THE_SHINING));

        controller.execute(ConsoleController.LIST_ACTION);

        List<String> outputLines = consoleStub.getRecordedOutput();
        assertTrue(outputLines.contains(MOVIE_NAME_JAWS));
        assertTrue(outputLines.contains(MOVIE_NAME_THE_SHINING));
        assertEquals(movieListFooter(2), outputLines.get(2));
    }

    @Test
    public void shouldIndicateIfListingEmptyMovieList() {
        controller.execute(ConsoleController.LIST_ACTION);

        List<String> outputLines = consoleStub.getRecordedOutput();
        assertEquals(ConsoleController.MESSAGE_EMPTY_MOVIE_COLLECTION, outputLines.get(0));        
    }

    private String movieListFooter(final int count) {
        return String.format(ConsoleController.FOOTER, count);
    }

    /**
     * Stub of console given canned answers. Can be queried for output.
     */
    private class ConsoleRecorder implements Console {
        
        List<String> lines = new ArrayList<String>();
        
        public void printLine(String content) {
            lines.add(content);
        }

        private List<String> getRecordedOutput() {
            return lines;
        }        
    }
}
