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
            if (count >= 3) {
                System.out.println(player + " введите число от 1 до 3: ");
            } else {
                System.out.println(player + " введите число от 1 до " + count);
            }
            int matches = Integer.parseInt(input.nextLine());
            if (count > 3) {
                if (matches >= 1 && matches <= 3) {
                    turn = !turn;
                    count = count - matches;
                } else {
                    System.out.println("Число должно быть от 1 до 3. Повторите попытку.");
                }
            } else {
                if (matches >= 1 && matches <= count) {
                    turn = !turn;
                    count = count - matches;
                } else {
                    System.out.println("Число должно быть от 1 до " + count + " Повторите попытку.");
                }
            }
        }
        if (!turn) {
            System.out.println("Выйграл первый игрок");
        } else {
            System.out.println("Выйграл второй игрок");
        }
    }
}
