package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        boolean rsl = false;
        List<String> check = new ArrayList<>(list);
        list.add(str);
        if (!list.equals(check)) {
            rsl = true;
        }
        return rsl;
    }
}
