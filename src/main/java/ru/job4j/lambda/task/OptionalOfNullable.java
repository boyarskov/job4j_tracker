package ru.job4j.lambda.task;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (int i = 0; i < strings.size(); i++) {
            if (Objects.equals(strings.get(i), value)) {
                return Optional.ofNullable(strings.get(i));
            }
        }
        return Optional.empty();
    }
    }