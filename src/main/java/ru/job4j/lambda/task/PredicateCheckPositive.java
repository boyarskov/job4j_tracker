package ru.job4j.lambda.task;

import java.util.function.Predicate;

public class PredicateCheckPositive {

    public static boolean check(int num) {
        Predicate<Integer> predicate = x -> num > 0;
        return check(predicate, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

}