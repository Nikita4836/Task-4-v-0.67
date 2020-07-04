package com.company;



public class Read {

    public static double[] coordinates(double[] points) {
        double[] arrPointsCoordinates = new double[points.length / 2];
        int n = 0;
        int m = 0;
        double x = 0, y = 0;
        while (n < points.length) {
            if (n % 2 == 0) {
                x = points[n];
            } else {
                y = points[n];
                double point = Math.sqrt(Math.sqrt(y) + Math.sqrt(x));
                m++;
                arrPointsCoordinates[n - m] = point;
            }
            n++;
        }
        return arrPointsCoordinates;
    }
}
