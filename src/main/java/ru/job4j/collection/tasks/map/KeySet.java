package ru.job4j.collection.tasks.map;

import java.util.HashMap;
import java.util.Map;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
