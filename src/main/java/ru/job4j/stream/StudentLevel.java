package ru.job4j.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.Stream;

public class StudentLevel {
    /**
     * Получить список студентов, проходящих по баллам
     * Условие: баллов, больше чем bound
     * @param students входной список студентов
     * @param bound проходной балл
     * @return список студентов, проходящие условие
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
          .filter(Objects::nonNull)
                .sorted((left, right) -> Integer.compare(right.getScore(), left.getScore()))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}
