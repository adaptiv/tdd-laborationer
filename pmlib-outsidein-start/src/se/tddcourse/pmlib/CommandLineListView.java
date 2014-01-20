package se.tddcourse.pmlib;

import java.util.ArrayList;
import java.util.List;

public class CommandLineListView implements MovieListView {

	private static final String NEW_LINE = "\n";
	public static final String EMPTY_LIST_FOOTER = "Ditt filmbibliotek är tomt.";
	public static final String SUMMARY_FOOTER = "Antal filmer i samlingen %d.";
	private List<String> lines = new ArrayList<String>();

	public CommandLineListView() {
	}

	public String view() {
		StringBuilder builder = new StringBuilder();
		combineLines(builder);
		clearContentForNextRequest();
		String contentWithoutTrailingNewLine = builder.toString().trim();
		return contentWithoutTrailingNewLine;
	}

	private void clearContentForNextRequest() {
		lines.clear();
	}

	private void combineLines(StringBuilder builder) {
		for(String line : lines) {
			addLine(builder, line);
		}
	}

	private void addLine(StringBuilder builder, String line) {
		builder.append(line);
		builder.append(NEW_LINE);
	}
	
	public void addFooter(int numberOfMovies) {
		boolean listEmpty = numberOfMovies == 0;
		if (listEmpty) {
			lines.add(EMPTY_LIST_FOOTER);
		} else {
			lines.add(String.format(SUMMARY_FOOTER, numberOfMovies));			
		}
	}

}
