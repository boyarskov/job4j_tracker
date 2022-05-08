package ru.job4j.collection.tasks.map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (int i = 1; i <= name.size(); i++) {
            String countSurname = surname.get(i);
            name.computeIfPresent(i, (key, value) -> value + " " + countSurname);
        }
        return name;
    }
}
