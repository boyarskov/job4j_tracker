package ru.job4j.stream.task;

import java.util.List;
import java.util.Optional;

public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings
                .stream()
                .findFirst()
                .filter(s -> s.endsWith(".java"))
                .flatMap(s -> Optional.of(s.length()));
    }
}
