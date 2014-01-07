package se.tddcourse.pmlib;

/**
 * Represents an movie, a work of art.
 */
public class Movie {

    private String title;

    /**
     * Creates a movie with the given title.
     *
     * @param title movie title
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * Returns the title of the movie.
     *
     * @return movie title
     */
    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Movie) {
            Movie another = (Movie) obj;
            return title.equals(another.title);
        }
        return false;
    }

    
}
