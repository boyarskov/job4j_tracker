package ru.job4j.stream.task;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CollectorArithmeticTest {

    @Test
    public void whenWithout6() {
        int out = CollectorArithmetic.collect(List.of(1, 2, 3));
        assertEquals(6, out);
    }

    @Test
    public void whenWith0() {
        int out = CollectorArithmetic.collect(List.of(0, 2, 3));
        assertEquals(0, out);
    }

    @Test
    public void whenWithout1495() {
        int out = CollectorArithmetic.collect(List.of(5, 23, 13));
        assertEquals(1495, out);
    }

}
