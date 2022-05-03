package ru.job4j.collection.tasks.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> set = new HashSet<>(Arrays.asList(combination));
        return set.size() == 1;
    }
}