package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 44, 23, -2, 33, 12, -9, -12);
        List<Integer> positive = numbers.stream().filter(
                number -> number > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
