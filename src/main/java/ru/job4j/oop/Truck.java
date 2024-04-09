package ru.job4j.oop;

public class Truck extends VehicleAbstract {

    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }
}
