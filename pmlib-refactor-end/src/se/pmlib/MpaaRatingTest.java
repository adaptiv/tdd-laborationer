package se.pmlib;

import static org.junit.Assert.*;

import org.junit.Test;


public class MpaaRatingTest {

    @Test
    public void shouldDeduceRatingFromString() throws Exception {
        MpaaRating ratingR = MpaaRating.valueOf("R");
        assertEquals("R", ratingR.toString());
        
        MpaaRating ratingPG13 = MpaaRating.valueOf("PG13");
        assertEquals("PG13", ratingPG13.toString());        
    }
}
