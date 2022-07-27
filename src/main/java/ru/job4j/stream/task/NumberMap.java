package ru.job4j.stream.task;

import java.util.List;
import java.util.stream.Collectors;

public class NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }
}
