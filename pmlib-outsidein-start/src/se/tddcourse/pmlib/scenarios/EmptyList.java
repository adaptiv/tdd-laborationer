package se.tddcourse.pmlib.scenarios;

import org.jbehave.scenario.JUnitScenario;

import se.tddcourse.pmlib.scenarios.steps.MovieCollectionSteps;

public class EmptyList extends JUnitScenario {

	public EmptyList() {
		super(new MovieCollectionSteps());
	}
}
