package ru.job4j.collection.tasks.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        for (String rsl : words) {
            if (s.contains(rsl)) {
                return "Выберите другую статью...";
            }
            }
        return "Вы сделали правильный выбор!";
        }
    }