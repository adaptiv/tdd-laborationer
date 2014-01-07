package se.tddcourse.pmlib.scenarios;

import org.jbehave.scenario.JUnitScenario;

import se.tddcourse.pmlib.scenarios.steps.MovieCollectionSteps;

public class SmallMovieCollectionDisplaysList extends JUnitScenario {

	public SmallMovieCollectionDisplaysList() {
		super(new MovieCollectionSteps());
	}
}
