package ru.job4j.lambda.task;

import java.util.function.Function;

public class FunctionFormula {

    public static double calculate(double x) {
        Function<Double, Double> y = f -> (x * x) + (2 * x) + 1;
        return calculate(y, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}
