package ru.job4j.oop;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " начинает движение от ЖД-вокзала и движется по рельсам");
    }
}
