package ru.job4j.collection;

import java.util.*;

public class Departments {
/**
 * метод fillGaps() должен сформировать список строк, при этом учитывает отсутствующие коды подразделений;
 */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    start += "/" + el;
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

/**
 * метод sortAsc() отсортировывает по возрастанию список строк, который он принимает на вход
 */
    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
            }

    /**
     * метод sortDesc() отсортировывает в соответствии с компаратором DepDescComp список строк,
     * который он принимает на вход
     */
    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
