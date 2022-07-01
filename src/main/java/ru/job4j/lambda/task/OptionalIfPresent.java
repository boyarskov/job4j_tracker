package ru.job4j.lambda.task;

import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        max(data).ifPresent(i -> System.out.println("Max: " + i));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length != 0) {
            int maxArray = data[0];
            for (int i = 1; i < data.length; i++) {
                if (maxArray < data[i]) {
                    maxArray = data[i];
                }
            }
            return Optional.of(maxArray);
        }
            return Optional.empty();
        }
    }