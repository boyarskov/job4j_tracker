package ru.job4j.stream.task;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnyMatchMethodTest {
    @Test
    public void test() {
        assertTrue(AnyMatchMethod.check(List.of("academy", "job4j")));
        assertFalse(AnyMatchMethod.check(List.of("academy", "university")));
    }
}
