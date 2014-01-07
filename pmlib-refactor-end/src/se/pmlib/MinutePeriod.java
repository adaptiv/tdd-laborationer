package se.pmlib;

public class MinutePeriod {

    private int minutes;

    public MinutePeriod(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("time period cannot be negative");
        }

        this.minutes = minutes;
    }

    public String render() {
        return "" + minutes;
    }

    
}
