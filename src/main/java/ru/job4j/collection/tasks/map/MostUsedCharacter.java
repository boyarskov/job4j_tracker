package ru.job4j.collection.tasks.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        str = str.replaceAll("\\s+", "").toLowerCase();
        TreeMap<Character, Integer> tree = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            tree.computeIfPresent(str.charAt(i), (k, v) -> v + 1);
            tree.putIfAbsent(str.charAt(i), 1);
        }
        int max = 0;
        for (Character c : tree.keySet()) {
            if (tree.get(c) > max) {
                max = tree.get(c);
                rsl = c;
            }
        }

        return rsl;
    }
}
