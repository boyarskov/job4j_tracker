package ru.job4j.collection.tasks;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String r = list.remove(list.size() - 1);
        if (index <= (list.size() - 1)) {
            list.set(index, r);
        }
        return list;
    }
}