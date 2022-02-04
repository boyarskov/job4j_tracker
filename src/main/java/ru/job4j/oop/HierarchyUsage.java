package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport tp = car;
        Object obj = car;
        Object ocar = new Car();
        Car carFromObject = (Car) ocar;

        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
