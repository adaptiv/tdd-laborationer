package se.pmlib;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonNameTest {

    @Test
    public void shouldConsistOfFirstAndLastName() throws Exception {
        PersonName personName = new PersonName("Ben", "Hur");
        assertEquals("Ben", personName.getFirstName());
        assertEquals("Hur", personName.getLastName());
    }
    
    @Test
    public void shouldSplitFullName() throws Exception {
        PersonName personName = new PersonName("Marty Feldman");
        assertEquals("Marty", personName.getFirstName());
        assertEquals("Feldman", personName.getLastName());        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void shouldRejectNullName() throws Exception {
        new PersonName(null);
    }

    @Test(expected=IllegalArgumentException.class)
    public void shouldRejectEmptyName() throws Exception {
        new PersonName("");
    }

    @Test
    public void shouldHandleOnlyLastName() throws Exception {
        PersonName personName = new PersonName("Bergman");
        assertEquals("", personName.getFirstName());
        assertEquals("Bergman", personName.getLastName());        
    }
    
    @Test
    public void shouldRenderTwoNamesNicely() throws Exception {
        PersonName personName = new PersonName("John", "Cleese");
        assertEquals("John Cleese", personName.render());        
    }

    @Test
    public void shouldRenderLastNameNicely() throws Exception {
        PersonName personName = new PersonName("Crockett");
        assertEquals("Crockett", personName.render());        
    }
}
