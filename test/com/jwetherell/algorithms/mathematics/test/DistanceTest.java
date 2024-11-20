package com.jwetherell.algorithms.mathematics.test;

import com.jwetherell.algorithms.mathematics.Distance;

import org.junit.Test;
import static org.junit.Assert.*;

public class DistanceTest {
    final long[] x = {0, 0};
    final long[] y = {3, 4};

    @Test
    public void testChebyshevDistance() {
        final long expectedX = 4;
        final long z = Distance.chebyshevDistance(x, y);
        assertEquals(expectedX, z);
    }

    @Test
    public void testSquaredDistance() {
        final double expectedX = 25;
        final double z = Distance.squaredDistance(x[0], x[1], y[0], y[1]);
        assertEquals(expectedX, z, 0.0);
    }

    @Test
    public void testEuclideanDistance() {
        final double expectedX = 5;
        final double z = Distance.euclideanDistance(x[0], x[1], y[0], y[1]);
        assertEquals(expectedX, z, 0.0);
    }
}
