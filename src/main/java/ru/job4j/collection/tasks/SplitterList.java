package ru.job4j.collection.tasks;

import java.util.List;

public class SplitterList {
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.addAll(middle);
        left.retainAll(middle);
        return left;
    }
}
