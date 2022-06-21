package ru.job4j.steam;

import org.junit.Test;
import ru.job4j.stream.ListToMap;
import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    public void whenInputListNotHaveDuplicate() {
        List<Student> list = Arrays.asList(
                new Student(30, "Ivanov"),
                new Student(40, "Petrov"),
                new Student(50, "Sidorov")
        );
        Map<String, Student> result = ListToMap.convert(list);
        Map<String, Student> expected = new LinkedHashMap<>();
        expected.put("Ivanov", new Student(30, "Ivanov"));
        expected.put("Petrov", new Student(40, "Petrov"));
        expected.put("Sidorov", new Student(50, "Sidorov"));
        assertEquals(expected, result);
    }

    @Test
    public void whenInputListHaveDuplicate() {
        List<Student> list = Arrays.asList(
                new Student(30, "Ivanov"),
                new Student(40, "Petrov"),
                new Student(50, "Ivanov"),
                new Student(60, "Sidorov"),
                new Student(70, "Petrov")
        );
        Map<String, Student> result = ListToMap.convert(list);
        Map<String, Student> expected = new LinkedHashMap<>();
        expected.put("Ivanov", new Student(30, "Ivanov"));
        expected.put("Petrov", new Student(40, "Petrov"));
        expected.put("Sidorov", new Student(60, "Sidorov"));
        assertEquals(expected, result);
    }
}
