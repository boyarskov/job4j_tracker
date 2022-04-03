package ru.job4j.collection;

import java.util.Comparator;
/**
 * Компаратор для сортировки по убыванию
 * DepDescComp расширяет интерфейс Comparator
 */

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] one = o1.split("/");
        String[] two = o2.split("/");
        int rsl = two[0].compareTo(one[0]);
        if (rsl == 0) {
            rsl = o1.compareTo(o2);
        }
        return rsl;
    }
}
