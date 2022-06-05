package ru.job4j.lambda;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> b = (i, s) -> map.put(i, s);
        b.accept(1, "one");
        b.accept(2, "two");
        b.accept(3, "three");
        b.accept(4, "four");
        b.accept(5, "five");
        b.accept(6, "six");
        b.accept(7, "seven");
        BiPredicate<Integer, String> biPred = (i, s) -> {
                if (i % 2 == 0 || map.get(i).length() == 4) {
                    return true;
                }
                return false;
            };
        for (Integer i : map.keySet()) {
           if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = sup.get();
        Consumer<String> con = (s) -> System.out.println(s);
        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings) {
            con.accept(func.apply(s));
        }
    }
}


