package ru.job4j.oop;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " начинает движение в аэропорту и движется по воздуху");
    }
}
