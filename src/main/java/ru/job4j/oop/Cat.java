package ru.job4j.oop;

public class Cat {

    private String food;

    public void show() {
        System.out.println(this.food);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.show();
    }
}
