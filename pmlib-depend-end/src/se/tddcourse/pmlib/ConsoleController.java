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
     * @param consoleView text-based console for I/O
     * @param movieListModel a container for movies
     */
    public ConsoleController(Console consoleView, MovieList movieListModel) {
        this.movieList = movieListModel;
        this.console = consoleView;
    }

    /**
     * Executes given command on the model.
     *
     * @param command a string representing the command to execute
     */
    void execute(String command) {
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
