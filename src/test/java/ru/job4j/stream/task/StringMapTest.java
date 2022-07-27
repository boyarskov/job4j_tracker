package ru.job4j.stream.task;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StringMapTest {

    @Test
    public void test() {
        List<String> input = List.of("One", "Two");
        List<String> expect = List.of("One.java", "Two.java");
        assertEquals(expect, StringMap.map(input));
    }

}