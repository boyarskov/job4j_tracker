package ru.job4j.stream.task;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CollectToAnyCollectionTest {

    @Test
    public void test() {
        List<Integer> data = List.of();
        String expectClass = "java.util.LinkedHashSet";
        String resultClass = CollectToAnyCollection.collect(data.stream()).getClass().getName();
        assertEquals(expectClass, resultClass);
    }

}