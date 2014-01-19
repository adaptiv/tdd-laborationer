package se.tddcourse.pmlib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        // TODO Setup fixture
    }

    @Test
    public void shouldListAllMoviesWithTotalCount() {
        movieList.add(new Movie(MOVIE_NAME_JAWS));
        movieList.add(new Movie(MOVIE_NAME_THE_SHINING));

        controller.execute(ConsoleController.LIST_ACTION);

        List<String> outputLines = consoleStub.getRecordedOutput();
        assertTrue(outputLines.contains(MOVIE_NAME_JAWS));
        assertTrue(outputLines.contains(MOVIE_NAME_THE_SHINING));
        assertEquals(String.format(ConsoleController.FOOTER, 2), outputLines.get(2));
    }

    /**
     * Stub of console given canned answers. Can be queried for output.
     */
    private class ConsoleRecorder implements Console {

        List<String> lines = new ArrayList<String>();

        public void printLine(String content) {
            // TODO Save output
        }

        private List<String> getRecordedOutput() {
            // TODO Return output
            return null;
        }        
    }
}
