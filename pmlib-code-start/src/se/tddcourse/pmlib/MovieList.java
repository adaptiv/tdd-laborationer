package se.tddcourse.pmlib;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

	private List<String> movies = new ArrayList<String>();

    public MovieList() {
    }

    public MovieList(String title) {
        movies.add(title);
    }

    public int size() {
		return movies.size();
	}

}
