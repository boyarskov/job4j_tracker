package ru.job4j.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Departments {
/*
 метод fillGaps() должен сформировать список строк, при этом требуется учесть все возможно отсутствующие коды подразделений;
 */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                /* tmp.add start + "/" + el */
            }
        }
        return new ArrayList<>(tmp);
    }

/*
метод sortAsc() должен просто отсортировать по возрастанию список строк, который он принимает на вход,
вызывать дополнительно fillGaps() в этом методе не нужно;
 */
    public static void sortAsc(List<String> orgs) {
    }

    /*
метод sortDesc() должен просто отсортировать в соответствии с компаратором DepDescComp список строк,
который он принимает на вход, вызывать дополнительно fillGaps() в этом методе не нужно;
     */
    public static void sortDesc(List<String> orgs) {
    }
}
