package com.jwetherell.algorithms.mathematics;

public class Distance {

    private Distance() { }

    /*
     * Chess distance
     */
    public static final long chebyshevDistance(long[] point1, long[] point2) {
        long x1 = point1[0];
        long y1 = point1[1];
        long x2 = point2[0];
        long y2 = point2[1];
        return Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
    }

    public static final double squaredDistance(double x1, double y1, double x2, double y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double sqr = (x * x) + (y * y);
        return sqr;
    }

    public static final double euclideanDistance(double x1, double y1, double x2, double y2) {
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        double sqrt = Math.sqrt(y + x);
        return sqrt;
    }
}
