package se.tddcource.pmlib;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import se.tddcourse.pmlib.Kalkylator;

public class KalkylatorSpec {

	private Kalkylator kalkylator;

	@Before
	public void skapaKalkylator() {
		kalkylator = new Kalkylator();
	}

	@Test
	public void adderarTvåSiffror() {
		// Arrange
		kalkylator.ange(50);
		kalkylator.ange(70);
		
		// Act
		int resultat = kalkylator.addera();
		
		// Assert
		assertThat(resultat, is(120));
	}

}
