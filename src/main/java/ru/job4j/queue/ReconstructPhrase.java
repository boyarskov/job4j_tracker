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
       //StringBuilder rsl = new StringBuilder();

       //for (int i = descendingElements.size(); i == 0; i--) {
      //     //rsl.append(descendingElements.)
     //  }

       return "3";
}

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }

    public static void main(String[] args) {
        Deque<Character> evenElements = new LinkedList<>(
                Arrays.asList(
                        'S', '1', 'l', '3', 'o', 'h', 'g', 'h', 'a', 'm', 'n', 't',
                        ' ', 't', 'o', ' ', 'f', 'q', ' ', '6', 'l', '.', 'a', ',',
                        'n', 'w', 'g', 'd', 'u', 'a', 'a', 'u', 'g', 'd', 'e', 'q',
                        ' ', 'y', 'J', 'd', 'a', 'k', 'v', 'p', 'a', 'e', ':', 'b'
                )
        );
        Deque<Character> descendingElements = new LinkedList<>(
                Arrays.asList(
                        'e', 'r', 'e', 'h', 'w', 'y', 'r', 'e', 'v', 'e', ' ', 'n', 'u',
                        'r', ' ', ',', 'e', 'c', 'n', 'o', ' ', 'e', 't', 'i', 'r', 'W', ' '
                )
        );
        String expected = "Slogan of language Java: Write once, run everywhere";
        String result = new ReconstructPhrase(descendingElements, evenElements).getReconstructPhrase();
        System.out.println(result);
    }
}
