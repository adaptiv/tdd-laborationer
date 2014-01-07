package se.tddcourse.pmlib.scenarios.steps;

import static org.jbehave.Ensure.*;
import static org.hamcrest.Matchers.*;

import org.jbehave.scenario.annotations.BeforeScenario;
import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

import se.tddcourse.pmlib.CommandLineListView;
import se.tddcourse.pmlib.MovieList;
import se.tddcourse.pmlib.MovieListController;
import se.tddcourse.pmlib.MovieListView;

public class MovieCollectionSteps extends Steps {

	
	private MovieList collection;
	private MovieListView listView;
	private MovieListController movieCollectionController;
	
	@BeforeScenario
	public void setUpEmptyCollection() {
		collection = new MovieList();
		movieCollectionController = new MovieListController(collection);
		listView = new CommandLineListView();
		movieCollectionController.setListView(listView);
	}

	@Given("the collection is empty")
	public void doNothing() {
		collection.clear();
	}

	@When("I add movies $first, $second and $third")
	public void addOneMovie(String first, String second, String third) {
		movieCollectionController.addMovie(first);
		movieCollectionController.addMovie(second);
		movieCollectionController.addMovie(third);
	}

	@When("I list the movies")
	public void listMovies() {
		movieCollectionController.list();
	}
	
	@Then("the list of movies should look like $listing")
	public void ensureListSimilarity(String listing) {
		ensureThat(listView.view(), equalTo(listing));
	}
	
}
