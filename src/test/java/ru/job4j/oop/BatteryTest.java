package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BatteryTest {

    @Test
    public void whenThis30Another50ThenAnotherLoadEqual80() {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        charger.exchange(another);
        int expected = 80;
        assertThat(expected, is(another.getLoad()));
    }

    @Test
    public void whenThis80Another20ThenThisLoadEqual0() {
        Battery charger = new Battery(80);
        Battery another = new Battery(20);
        charger.exchange(another);
        int expected = 0;
        assertThat(expected, is(charger.getLoad()));
    }

    @Test
    public void whenThis95Another0ThenAnotherLoadEqual80() {
        Battery charger = new Battery(95);
        Battery another = new Battery(0);
        charger.exchange(another);
        int expected = 95;
        assertThat(expected, is(another.getLoad()));
    }
}