package ru.job4j.collection.tasks.set;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Pangram {
    public static boolean checkString(String str) {
        int count = 0;
        char s[] = str.replaceAll("\\s+", "").toCharArray();
        Set<Character> hs = new HashSet<Character>();
        for (int i = 0; i < s.length; i++) {
            hs.add(s[i]);
        }
        Iterator<Character> i = hs.iterator();
        while (i.hasNext()) {
            count++;
            i.next();
        }
        return count == 26;
    }
}