package ru.job4j.stream.task;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MapToIntMethodTest {

    @Test
    public void test() {
        assertEquals(294, MapToIntMethod.sum(List.of('a', 'b', 'c')));
    }

}
