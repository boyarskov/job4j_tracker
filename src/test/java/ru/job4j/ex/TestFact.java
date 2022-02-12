package ru.job4j.ex;

import org.junit.Test;

public class TestFact {

    @Test(expected = IllegalArgumentException.class)
    public void whenNequalNegativeThenFinish() {
        new Fact().calc(-1);
    }

}
