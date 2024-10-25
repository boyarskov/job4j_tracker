package ru.job4j.queue;

import java.util.Comparator;

public class TaskByPositionAsc implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.getPosition().compareTo(o2.getPosition());
    }
}
