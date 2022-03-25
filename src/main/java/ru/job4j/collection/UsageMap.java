package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {

        HashMap<String, String> bio = new HashMap<>();
        bio.put("artem@gosnn.ru", "Artem Boyarskov");
        bio.put("maxim@gosnn.ru", "Maxim Petrov");
        bio.put("lliyana@gosnn.ru", "Uliyana Ovina");
        for (String key : bio.keySet()) {
            String value = bio.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
