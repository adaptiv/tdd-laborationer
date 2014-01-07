package se.pmlib;

public class PersonName {

    private String firstName;
    private String lastName;

    public PersonName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Must have first and last name");
        }

        this.firstName = identifyFirstName(splitByWhiteSpace(fullName));
        this.lastName = identifySecondName(splitByWhiteSpace(fullName));
    }

    private String[] splitByWhiteSpace(String aString) {
        return aString.split("\\s");
    }
    
    private String identifyFirstName(String[] tokens) {
        return (tokens.length >= 2) ? tokens[0] : "";
    }

    private String identifySecondName(String[] tokens) {
        return (tokens.length >= 2) ? tokens[1] : tokens[0];
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String render() {
        return (firstName.isEmpty()) ? lastName : firstName + " " + lastName; 
    }
}
