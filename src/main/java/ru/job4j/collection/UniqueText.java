package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String check1 : origin) {
            check.add(check1);
        }
        for (String cont : text) {
            if (!check.contains(cont)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
