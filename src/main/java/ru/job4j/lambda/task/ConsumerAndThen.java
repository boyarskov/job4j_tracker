package ru.job4j.lambda.task;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = s -> System.out.print(input);
        Consumer<String> ln = s -> System.out.println();
        return print.andThen(ln);
    }
}
