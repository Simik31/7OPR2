package cz.osu.student.R19584;

public class Penalty {
    private String description;

    public Penalty(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return "Penalty reason: " + getDescription();
    }
}
