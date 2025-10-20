package com.example.decathlon.Shoba;

public class AthleteEvent {
    private String name;
    private double score;

    // Constructor
    public AthleteEvent(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // Get athlete's name
    public String getName() {
        return name;
    }

    // Get athlete's score
    public double getScore() {
        return score;
    }

    // Check if athlete qualifies for the next round
    public boolean isQualified(double threshold) {
        return score >= threshold;
    }

    // Example: Print athlete details
    public void printDetails() {
        System.out.println("Athlete: " + name + ", Score: " + score);
    }
}
