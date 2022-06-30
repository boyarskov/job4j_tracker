package ru.job4j.lambda.task;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> stringResult = Optional.empty();
        for (String rsl : strings) {
            if (rsl.equals(value)) {
                stringResult = Optional.of(value);
                break;
            }
        }
        return stringResult;
    }
}