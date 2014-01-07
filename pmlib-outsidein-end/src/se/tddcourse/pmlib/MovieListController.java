package se.tddcourse.pmlib;

public class MovieListController {

	public static final String EMPTY_LIST_FOOTER = "There are no movies in the collection";
	private MovieList collection;
	private MovieListView listView;

	public MovieListController(MovieList collection) {
		this.collection = collection;
	}

	public void setListView(MovieListView listView) {
		this.listView = listView;
		
	}

	public void addMovie(String title) {
		collection.addMovie(new Movie(title));
	}

	public void list() {
		collection.listMoviesTo(listView);
		listView.addFooter(collection.size());
	}

}
