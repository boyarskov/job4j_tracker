package ru.job4j.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder rsl = new StringBuilder();
        int i = 0;

        for (Character string : evenElements) {
            if (i % 2 == 0) {
                rsl.append(string);
            }
            i++;
        }
                return rsl.toString();
    }

    private String getDescendingElements() {
        StringBuilder rsl = new StringBuilder();
        for (Character ch : descendingElements) {
          rsl.insert(0, ch);
        }

       return rsl.toString();
}

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
