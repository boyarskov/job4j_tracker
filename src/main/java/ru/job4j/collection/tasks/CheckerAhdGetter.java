package ru.job4j.collection.tasks;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String rsl = "";
        int i = 0;
        for (String value : list) {
            if (list.isEmpty()) {
                return rsl;
            } else {
                rsl = list.get(i);
            }
        }
        return rsl;
    }
}