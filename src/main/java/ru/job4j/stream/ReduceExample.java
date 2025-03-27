package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<Integer> numbersTwo = Arrays.asList(1, 2, 3, 4);
        List<String> nums = List.of("Один", "Два", "Три");

        Optional<Integer> sum = numbers.stream()
                .reduce((left, right) -> left + right);
        System.out.println(sum.get());

        int sumIdentity = numbersTwo.stream()
                .reduce(2, (left, right) -> left + right);
        System.out.println(sumIdentity);

        Optional<String> sums = nums.stream()
                .reduce((left, right) -> left + ", " + right);
        System.out.println(sums.get());
    }
}
