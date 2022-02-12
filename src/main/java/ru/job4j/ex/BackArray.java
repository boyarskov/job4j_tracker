package ru.job4j.ex;

import java.util.Arrays;

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            int i = (names.length - index);
            if (index >= i) {
                names[index] = names[i];
                names[names.length - index] = temp;
            } else {
                System.out.println("Действие не может быть выполнено");
            }
        }
        System.out.println(Arrays.toString(names));
    }
}