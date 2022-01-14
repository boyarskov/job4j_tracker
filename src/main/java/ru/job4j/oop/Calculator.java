package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int g) {
        return g - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + minus(c) + multiply(c) + divide(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rslMinus = calculator.minus(10);
        System.out.println(rslMinus);
        int rslDivide = calculator.divide(15);
        System.out.println(rslDivide);
        int rslSum = calculator.sumAllOperation(10);
        System.out.println(rslSum);
    }
}
