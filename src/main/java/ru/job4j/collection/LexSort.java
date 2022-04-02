package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftSplit = left.split("\\. ");
        String[] rightSplit = right.split("\\. ");
        int leftInt = Integer.parseInt(String.valueOf(leftSplit[0]));
        int rightInt = Integer.parseInt(String.valueOf(rightSplit[0]));
        return Integer.compare(leftInt, rightInt);
    }
}
