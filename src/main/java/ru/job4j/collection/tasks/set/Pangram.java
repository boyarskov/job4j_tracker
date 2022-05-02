package ru.job4j.collection.tasks.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Pangram {
    public static boolean checkString(String s) {
        s = s.replaceAll("\\s+", "");
        s = s.toLowerCase();
        Set<String> set = new HashSet<>(Arrays.asList(s.split("")));
        boolean rsl = false;
        if (set.size() == 26) {
                if ((set.contains(String.valueOf('a'))) || (set.contains(String.valueOf('b')))
                        || (set.contains(String.valueOf('c'))) || (set.contains(String.valueOf('d'))) || (set.contains(String.valueOf('e')))
                        || (set.contains(String.valueOf('f'))) || (set.contains(String.valueOf('g'))) || (set.contains(String.valueOf('h')))
                        || (set.contains(String.valueOf('i'))) || (set.contains(String.valueOf('j'))) || (set.contains(String.valueOf('k')))
                        || (set.contains(String.valueOf('l'))) || (set.contains(String.valueOf('m'))) || (set.contains(String.valueOf('n')))
                        || (set.contains(String.valueOf('o'))) || (set.contains(String.valueOf('p'))) || (set.contains(String.valueOf('q')))
                        || (set.contains(String.valueOf('r'))) || (set.contains(String.valueOf('s'))) || (set.contains(String.valueOf('t')))
                        || (set.contains(String.valueOf('u'))) || (set.contains(String.valueOf('v'))) || (set.contains(String.valueOf('w')))
                        || (set.contains(String.valueOf('x'))) || (set.contains(String.valueOf('y'))) || (set.contains(String.valueOf('z')))) {
                    rsl = true;
                }
            }
            return rsl;
        }
}

