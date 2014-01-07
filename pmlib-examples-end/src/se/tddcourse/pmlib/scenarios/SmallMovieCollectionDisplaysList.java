package se.tddcourse.pmlib.scenarios;

import org.jbehave.scenario.Scenario;

import se.tddcourse.pmlib.scenarios.steps.MovieListSteps;

public class SmallMovieCollectionDisplaysList extends Scenario {

    public SmallMovieCollectionDisplaysList() {
        super(new MovieListSteps());
    }
}
