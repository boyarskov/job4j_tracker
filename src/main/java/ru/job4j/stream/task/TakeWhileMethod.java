package ru.job4j.stream.task;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMethod {
    public static List<Integer> takeWhile(List<Integer> numbers) {
        return numbers
                .stream()
                .sorted()
                .takeWhile(element -> element < 0)
                .collect(Collectors.toList());
    }
}
