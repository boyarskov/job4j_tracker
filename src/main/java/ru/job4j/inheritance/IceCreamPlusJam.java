package ru.job4j.inheritance;

public class IceCreamPlusJam extends IceCream {
    private static final int JAM_PRICE = 50;

    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    @Override
    public int price() {
        return JAM_PRICE + super.price();
    }
}
