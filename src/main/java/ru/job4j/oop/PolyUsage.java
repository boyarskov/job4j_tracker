package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airbus = new Plane();
        Vehicle boeing = new Plane();
        Vehicle lastochka = new Train();
        Vehicle sapsan = new Train();
        Vehicle schoolBus = new Bus();
        Vehicle touristBus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{airbus, boeing, lastochka, sapsan, schoolBus, touristBus};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
