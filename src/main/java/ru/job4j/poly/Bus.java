package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Starting the movement");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("Total passangers: " + quantity);
    }

    @Override
    public double price(int fuel) {
        double price = 60.50;
        System.out.println("Fuel quantity: " + fuel);
        System.out.println("Price fuel: " + price);
        return price;
    }
}
