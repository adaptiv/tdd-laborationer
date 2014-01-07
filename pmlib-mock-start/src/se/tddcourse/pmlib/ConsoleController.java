package se.tddcourse.pmlib;

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
     * @param movies a container for movies
     */
    public ConsoleController(Console consoleToUse, MovieList movies) {
        this.console = consoleToUse;
        this.movieList = movies;
    }

    /**
     * Executes given command on the model.
     *
     * @param command the command to execute
     */
    void execute(String command) {
        // TODO
    }

}
