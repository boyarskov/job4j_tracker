package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //1
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        //System.out.println(map);
        //made
        BiConsumer<String, Integer> b = (s, s1) -> map.put(s1, s);
        //2
        //BiPredicate<Integer, String> biPred = (i, s) -> {
            Predicate<Integer> biPred = (i) -> {
                if (i % 2 == 0 || map.get(i).length() == 4) {
                    return true;
                }
                return false;
            };
        for (Integer i : map.keySet()) {
           if (biPred.test(i)) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        //3
/*
            Заменить создание ArrayList из значений Map на Supplier, объявлен ниже, требуется его реализовать.
         */
        Supplier<List<String>> sup = ...;
        List<String> strings = new ArrayList<>(map.values());

        Consumer<String> con = ...;
        Function<String, String> func = ...;
        for (String s : strings) {
            /*
                Заменить вывод строк на применение Consumer
                Заменить преобразование строк к строкам в верхнем регистре с помощью Function
                Необходимое объявлено выше, требуется их реализовать.
            */
            System.out.println(s.toUpperCase());
        }
    }
}


