package ru.job4j.collection.tasks.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> rsl = new HashMap<>();
        boolean trueOnFalse = false;
        for (String count : strings) {
        rsl.computeIfPresent(count, (key, val) -> true);
        rsl.putIfAbsent(count, trueOnFalse);
        }
        return rsl;
    }
}
