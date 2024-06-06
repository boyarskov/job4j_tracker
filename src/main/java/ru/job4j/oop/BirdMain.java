package ru.job4j.oop;

public class BirdMain {

    public static void main(String[] args) {
        Bird parrot = new Bird() {
            @Override
            public void fly() {
                System.out.println("Попугай пролетает над лужайкой");
            }
        };
    }
}
