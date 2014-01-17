package se.pmlib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieLibrary {

    private List<Movie> movies = new ArrayList<Movie>();

    public List<String> getMovies() {
        List<String> result = new ArrayList<String>();
        result.add("*********** Movies in Library ***********");
        for (Movie movie : movies) {
            StringBuilder builder = new StringBuilder();
            builder.append(movie.getTitle());
            builder.append(" by ");
            builder.append(movie.getDirector());
            builder.append(", ");
            builder.append(movie.getLength());
            builder.append(" mins, ");
            builder.append("rated ");
            builder.append(movie.getRating());
            result.add(builder.toString());
        }
        return result;
    }

    public void add(Movie movieToAdd) {
        movies .add(movieToAdd);
    }

    public int size() {
        return movies.size();
    }

    public List<String> getMoviesByTitle() {
        List<Movie> sorted = new ArrayList<Movie>(movies);
        Collections.sort(sorted);

        List<String> result = new ArrayList<String>();
        result.add("*********** Movies in Library ***********");
        for (Movie movie : sorted) {
            StringBuilder builder = new StringBuilder();
            builder.append(movie.getTitle());
            builder.append(" by ");
            builder.append(movie.getDirector());
            builder.append(", ");
            builder.append(movie.getLength());
            builder.append(" mins, ");
            builder.append("rated ");
            builder.append(movie.getRating());
            result.add(builder.toString());
        }
        return result;
    }

}
