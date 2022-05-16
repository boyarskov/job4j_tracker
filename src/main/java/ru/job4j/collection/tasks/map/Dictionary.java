package ru.job4j.collection.tasks.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String count : strings) {
            String charAt = String.valueOf(count.charAt(0));
            rsl.putIfAbsent(charAt, new ArrayList<>());
            rsl.get(charAt).add(count);
        }
        return rsl;
    }
}