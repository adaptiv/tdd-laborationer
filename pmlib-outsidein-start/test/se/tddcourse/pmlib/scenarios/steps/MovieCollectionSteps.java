package se.tddcourse.pmlib.scenarios.steps;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.sv.Givet;
import cucumber.api.java.sv.När;
import cucumber.api.java.sv.Så;
import se.tddcourse.pmlib.CommandLineListView;
import se.tddcourse.pmlib.MovieList;
import se.tddcourse.pmlib.MovieListController;
import se.tddcourse.pmlib.MovieListView;

import java.util.List;

public class MovieCollectionSteps {

	
	private MovieList collection;
	private MovieListView listView;
	private MovieListController movieCollectionController;
	
	@Before
	public void setUpEmptyCollection() {
		collection = new MovieList();
		movieCollectionController = new MovieListController(collection);
		listView = new CommandLineListView();
		movieCollectionController.setListView(listView);
	}
    @Givet("^att filmbiblioteket är tomt$")
    public void att_filmbiblioteket_är_tomt() throws Throwable {
        collection.clear();
    }

    @När("^jag lägger till filmerna \"(.+)\"")
    public void jag_lägger_till_filmerna(List<String> filmtitlar) throws Throwable {

        throw new PendingException("Not Implemented!");
    }

    @När("^jag listar alla filmer$")
    public void jag_listar_alla_filmer() throws Throwable {
        movieCollectionController.list();
    }

    @Så("^ska listan se ut så här:$")
    public void ska_listan_se_ut_så_här(List<String> expectedValues) throws Throwable {
        String result = "";
        for(String value : expectedValues) {
            result = result.concat(value);
        }
        assertThat(listView.view(), equalTo(result));
    }

}
