package ru.job4j.collection;

import java.util.Comparator;
/**
 * Компаратор для сортировки по убыванию
 */
/*
Класс DepDescComp должен расширять интерфейс Comparator:
- метод compare() должен реализовать сравнение в соответствии с описанием.
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return 0;
    }

    /*
    После реализации методов в классе Departments проверить корректность реализации вы можете с помощью тестов: DepartmentsTest
     */
}
