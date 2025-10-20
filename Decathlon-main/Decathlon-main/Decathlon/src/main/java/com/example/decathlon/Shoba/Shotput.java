package com.example.decathlon.Shoba;

public class Shotput {
    // Scoring constants for Men's Decathlon Shot Put (IAAF standard)
    // Points = INT(A(P — B)C)
    // Formula: points = A * (P - B)^C
    // P = performance in meters
    private static double A= 51.39;
    private static final double B = 1.50;
    private static final double C = 1.05;
    // Valid physical range for shot put (meters)
    private static final double MIN_DISTANCE = 0.0;
    private static final double MAX_DISTANCE = 30.0;
    public static boolean isValid(double distance) {
        return distance > MIN_DISTANCE && distance <= MAX_DISTANCE;
    }
    public static int calculatePoints(double distance) {
        if (!isValid(distance)) {
            throw new IllegalArgumentException("Invalid shot put distance: " + distance + " m");
        }
        double points = A * Math.pow(distance - B, C);
        return (int) Math.floor(points);
    }
    public static String formatResult(double distance) {
        return String.format("Shot Put: %.2f m → %d points", distance, calculatePoints(distance));
    }
    public static void main(String[] args) {
        double performance = 14.52;
        if (isValid(performance)) {
            System.out.println(formatResult(performance));
        } else {
            System.out.println("Invalid performance!");
        }
    }
}
