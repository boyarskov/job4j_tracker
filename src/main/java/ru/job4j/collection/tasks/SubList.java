package ru.job4j.collection.tasks;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        if (!list.contains(el) || list.lastIndexOf(el) == -1) {
            list = List.of();
        } else if (list.lastIndexOf(el) != -1) {
            list = list.subList(list.indexOf(el), list.lastIndexOf(el));
        }
        return list;
    }
}