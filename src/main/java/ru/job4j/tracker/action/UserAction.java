package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
