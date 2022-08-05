package ru.job4j.stream.task;

import ru.job4j.stream.Pupil;
import ru.job4j.stream.Tuple;

import java.util.List;
import java.util.stream.Stream;

public class Analyze {
    //Класс Analyze получает статистику по аттестатам.
    public static double averageScore(Stream<Pupil> stream) {
        //Метод averageScore() - вычисляет общий средний балл.
        return 0D;
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        //Метод averageScoreByPupil() - вычисляет средний балл по каждому ученику.
        return List.of();
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        //Метод averageScoreBySubject() - вычисляет средний балл по каждому предмету.
        return List.of();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        //Метод bestStudent() - возвращает лучшего ученика. Лучшим считается ученик с наибольшим суммарным баллом по всем предметам.
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        //Метод bestSubject() - возвращает предмет с наибольшим баллом для всех студентов.
        return null;
    }
}
