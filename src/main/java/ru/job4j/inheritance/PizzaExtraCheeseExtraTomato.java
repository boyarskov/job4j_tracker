package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return "Just tasty pizza " + "Cheese" + "Tomato";
    }
}
