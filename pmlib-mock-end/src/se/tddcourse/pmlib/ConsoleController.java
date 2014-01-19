package se.tddcourse.pmlib;

import java.util.Iterator;

/**
 * Application controller for the text-based version of the application.
 */
public class ConsoleController {

    static final String LIST_ACTION = "list";
    static final String FOOTER = "Antal filmer: %d st";
    static final String MESSAGE_EMPTY_MOVIE_COLLECTION = "Det finns inga filmer i samlingen.";

    private MovieList movieList;
    private Console console;

    /**
     * Creates instance with a console view to handle I/O and a domain model in the form of
     * a container for movies.
     *
     * @param console text-based console for I/O
     * @param movieList a container for movies
     */
    public ConsoleController(Console consoleToUse, MovieList movieList) {
        console = consoleToUse;
        this.movieList = movieList;
    }

    /**
     * Executes given command on the model.
     *
     * @param command the command to execute
     */
    public void execute(String command) {
        // NOTE Perhaps Command pattern will be useful later?
        if (LIST_ACTION.equals(command)) {
            processListCmd();
        }
    }

    private void processListCmd() {
        if (movieList.isEmpty()) {
            printMessage(MESSAGE_EMPTY_MOVIE_COLLECTION);
        } else {
            printMovieList();
            printFooter();
        }
    }

    private void printMessage(String message) {
        console.printLine(message);
    }

    private void printMovieList() {
        for (Movie movie : movieList) {
            console.printLine(movie.getTitle());
        }
    }

    private void printFooter() {
        console.printLine(String.format(FOOTER, movieList.numberOfMovies()));
    }
}
