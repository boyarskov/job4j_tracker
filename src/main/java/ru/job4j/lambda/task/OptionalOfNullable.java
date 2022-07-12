package ru.job4j.lambda.task;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String string : strings) {
            if (Objects.equals(string, value)) {
                return Optional.ofNullable(string);
            }
        }
        return Optional.empty();
    }
    }