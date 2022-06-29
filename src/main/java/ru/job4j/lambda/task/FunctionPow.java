package ru.job4j.lambda.task;

import java.util.function.Function;

public class FunctionPow {

    public static double calculate(double x) {
        Function<Double, Double> y = e -> x * x;
        return calculate(y, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}
