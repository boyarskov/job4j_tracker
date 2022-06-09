package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountingTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Counting.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenLinearResults2() {
        List<Double> result = Counting.diapason(5, 8, x -> x * 2 + 10);
        List<Double> expected = Arrays.asList(20D, 22D, 24D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        List<Double> result = Counting.diapason(2, 5, x -> x * x - 1);
        List<Double> expected = Arrays.asList(3D, 8D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenLinearResults() {
        List<Double> result = Counting.diapason(5, 8, x -> 2 * (Math.pow(2, x)) + 1);
        List<Double> expected = Arrays.asList(65D, 129D, 257D);
        assertThat(result, is(expected));
    }
}
