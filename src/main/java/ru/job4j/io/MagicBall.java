package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Ты хочешь узнать: " + name);
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Мой ответ : ДА");
        } else if (answer == 1) {
            System.out.println("Мой ответ : НЕТ");
        } else {
            System.out.println("Мой ответ : МОЖЕТ БЫТЬ");
        }
    }
}
