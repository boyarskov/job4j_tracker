package ru.job4j.stream.task;

import java.util.List;

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
        return characters
                .stream()
                .mapToInt(n -> (int) n)
                .sum();
    }
}