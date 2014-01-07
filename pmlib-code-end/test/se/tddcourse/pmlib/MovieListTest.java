package se.tddcourse.pmlib;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit specification of a {@link MovieList}.
 */
public class MovieListTest {

    private static final Movie MOVIE_THE_SHINING = new Movie("The Shining");
    private static final Movie MOVIE_JAWS = new Movie("Jaws");
    private static final Movie MOVIE_DELIVERANCE = new Movie("Deliverance");
    
    @Test
    public void emptyListShouldContainNoMovies() {
        MovieList emptyMovieList = new MovieList();
        assertEquals(0, emptyMovieList.numberOfMovies());
    }

    @Test
    public void canAddMovieToList() {
        MovieList emptyMovieList = new MovieList();
        Movie jaws = new Movie("Jaws");
        emptyMovieList.add(jaws);
        assertEquals(1, emptyMovieList.numberOfMovies());
    }
    
    @Test
    public void shouldIndicateNumberOfMovies() {
        MovieList movieList = new MovieList();
        movieList.add(MOVIE_DELIVERANCE);
        movieList.add(MOVIE_JAWS);
        movieList.add(MOVIE_THE_SHINING);
        assertEquals(3, movieList.numberOfMovies());   
    }

}
