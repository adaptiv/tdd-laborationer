package se.tddcourse.pmlib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CommandLineListViewSpec {

	private CommandLineListView view;

	@Before
	public void createView() {
		view = new CommandLineListView();
	}
	
	@Test
	public void shouldViewStandardFooterWhenEmpty() {
		view.addFooter(0);
		assertEquals(CommandLineListView.EMPTY_LIST_FOOTER, view.view());
	}
	
	@Test
	public void shouldViewSummaryFooterListingMovies() {
		view.addFooter(1);
		String[] lines = view.view().split("\n");
		assertEquals(String.format(CommandLineListView.SUMMARY_FOOTER, 1), lines[lines.length -1]);
	}
	
}
