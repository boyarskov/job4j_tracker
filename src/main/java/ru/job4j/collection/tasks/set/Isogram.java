package ru.job4j.collection.tasks.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        boolean rsl = true;
        char[] isogram = new char[s.length()];
        isogram = s.toCharArray();
        Set<Character> isogramSet = new HashSet<>();
        for (char symbol : isogram) {
            if (!isogramSet.add(symbol)) {
                rsl = false;
            }
        }
        return rsl;
    }
}