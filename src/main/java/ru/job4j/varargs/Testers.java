package ru.job4j.varargs;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class Testers {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 3, 7, 1, 8, 6, 5, 2);
        String result;

        result = findEvenOddNumbers(data);

        System.out.println(result);
    }

    public static String findEvenOddNumbers(List<Integer> data) {
        List<Integer> dataChet = data.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        List<Integer> dataNechet = data.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .collect(Collectors.toList());
        String dataStringChet = dataChet.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(", ", "(", ")"));
        String dataStringNechet = dataNechet.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(", ", "(", ")"));

        return dataStringChet + dataStringNechet;
    }
        }