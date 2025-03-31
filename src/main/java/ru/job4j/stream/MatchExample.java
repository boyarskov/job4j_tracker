package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> stringsTwo = Arrays.asList("Трижды", "Три", "Триста", "Три тысячи");
        boolean resultNoneMatch = strings
                .stream()
                .noneMatch("Шесть"::contains);
        boolean resultAnyMatch = strings
                .stream()
                .anyMatch(element -> element.endsWith("ь"));
        boolean resultAllMatch = stringsTwo
                .stream()
                .allMatch(element -> element.startsWith("Три"));
        System.out.println(resultNoneMatch);
        System.out.println(resultAnyMatch);
        System.out.println(resultAllMatch);
    }
}
