package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            System.out.println(">> Всего спичек осталось: " + count + " <<");
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до " + Math.min(3, count));
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= Math.min(3, count)) {
                turn = !turn;
                count -= matches;
                System.out.println("На столе осталось " + count + " спичек");
            } else {
                System.out.println("Число должно быть от 1 до " + Math.min(3, count) + ". Повторите попытку.");
            }
            }
        if (!turn) {
            System.out.println("Выйграл первый игрок");
        } else {
            System.out.println("Выйграл второй игрок");
        }
    }
}
