package se.pmlib;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinutePeriodTest {

    @Test
    public void shouldHoldLengthInMinutes() throws Exception {
        MinutePeriod period = new MinutePeriod(15);
        assertEquals("15", period.render());
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void shouldRejectNegativeLengths() throws Exception {
        new MinutePeriod(-1);
    }
}
