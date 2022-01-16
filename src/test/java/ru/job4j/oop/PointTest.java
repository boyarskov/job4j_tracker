package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when2D() {
        double expected = 4;
        Point a = new Point(8, 4);
        Point b = new Point(8, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3D() {
        double expected = 2;
        Point a = new Point(0, 3, 1);
        Point b = new Point(0, 3, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3Ds() {
        double expected = 2.828;
        Point a = new Point(0, 3, 1);
        Point b = new Point(0, 5, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
