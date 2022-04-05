package ru.job4j.collection.tasks;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!check.contains(str)) {
            check.add(index, str);
            return true;
        }
        return false;
    }
}