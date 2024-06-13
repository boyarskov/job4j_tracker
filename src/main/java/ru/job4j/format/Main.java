package ru.job4j.format;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = null;
        boolean result = true;

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 2 != 0) {
                result = false;
            }
        }

        System.out.println(result);
    }

}