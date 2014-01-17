package se.tddcourse.pmlib;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit specification of a {@link MovieList}.
 */
public class MovieListTest {

    private static final Movie MOVIE_THE_SHINING = new Movie("The Shining");
    private static final Movie MOVIE_JAWS = new Movie("Jaws");
    private static final Movie MOVIE_DELIVERANCE = new Movie("Deliverance");
    
    @Test
    public void emptyListHasSizeZero() {
        MovieList emptyMovieList = new MovieList();
        assertEquals(0, emptyMovieList.numberOfMovies());
    }

    @Test
    public void oneMovieListHasSizeOfOne() {
        MovieList oneMovieList = new MovieList(new Movie("Jaws"));
        assertEquals(1, oneMovieList.numberOfMovies());
    }
    
    @Test
    public void smallMovieListIndicatesNumberOfMovies() {
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(MOVIE_DELIVERANCE);
        movies.add(MOVIE_JAWS);
        movies.add(MOVIE_THE_SHINING);
        MovieList movieList = new MovieList(movies);

        assertEquals(3, movieList.numberOfMovies());
    }

}
