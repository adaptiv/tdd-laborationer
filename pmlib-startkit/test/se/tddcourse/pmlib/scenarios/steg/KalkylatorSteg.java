package se.tddcourse.pmlib.scenarios.steg;

import se.tddcourse.pmlib.Kalkylator;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.sv.Givet;
import cucumber.api.java.sv.När;
import cucumber.api.java.sv.Så;

public class KalkylatorSteg {
	
	private Kalkylator kalkylator;

	@Before
	public void skapaKalkylator() {
		kalkylator = new Kalkylator();
	}

	@Givet("^att jag har angett (\\d+) i kalkylatorn$")
	public void att_jag_har_angett_i_kalkylatorn(int siffra) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@När("^jag väljer att addera$")
	public void jag_väljer_att_addera() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Så("^ska resultatet (\\d+) visas på skärmen$")
	public void ska_resultatet_visas_på_skärmen(int resultat) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
}
