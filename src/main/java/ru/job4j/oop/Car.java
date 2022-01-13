package ru.job4j.oop;

public class Car {
    private String model;
    private int power;
    private double price;

    public Car() {
    }

    public Car(String model, int power, double price) {
        this.model = model;
        this.power = power;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Power: " + power + " horsepower");
        System.out.println("Price: " + price + " million RUB");
        System.out.println();
    }

    public static void main(String[] args) {
        Car skoda = new Car("Skoda Rapid", 125, 1.300000);
        skoda.showInfo();
        Car bmw = new Car("BMW 530D", 249, 5.600000);
        bmw.showInfo();
        Car noname = new Car();
        noname.showInfo();
    }
}
