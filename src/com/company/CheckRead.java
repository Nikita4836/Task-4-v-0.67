package com.company;

public class CheckRead {
    public static double[] checkCoordintesToNull(double[] points) {
        if (points == null) {
            return null;
        }
        return points;
    }

    public static double[] checkCoordintesToCorrect(double[] points) {
        if (points.length % 2 != 0) {
            return null;
        }
        return points;
    }
}