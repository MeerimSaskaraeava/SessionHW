package java8.transport;

import java8.announcement.Announcement;

import java.time.LocalDate;

public class Car  {
    private String colour;
    private LocalDate yearOfIssue;

    public Car( String colour, LocalDate yearOfIssue) {

        this.colour = colour;
        this.yearOfIssue = yearOfIssue;
    }

    public String getColour() {
        return colour;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }


}
