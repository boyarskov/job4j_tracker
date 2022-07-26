package ru.job4j.stream.task;

import java.util.List;

public class AnyMatchMethod {
    public static boolean check(List<String> data) {
        return data.stream().anyMatch(n -> data.contains("job4j"));
    }
}