package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;

        for (Pupil pupilZ : pupils) {
            for (Subject subjectZ : pupilZ.subject()) {
                sum += subjectZ.score();
                count++;
            }
        }

        return count == 0 ? 0 : sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();

        for (Pupil pupilZ : pupils) {
            double sumScore = 0;
            List<Subject> subjects = pupilZ.subject();

            for (Subject subjectZ : subjects) {
                sumScore += subjectZ.score();
            }

            double average = subjects.isEmpty() ? 0 : sumScore / subjects.size();
            rsl.add(new Label(pupilZ.name(), average));
        }

        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        List<Label> rsl = new ArrayList<>();

        for (Pupil pupilZ : pupils) {
            for (Subject subjectZ : pupilZ.subject()) {
                mapa.put(subjectZ.name(), mapa.getOrDefault(subjectZ.name(), 0) + subjectZ.score());
            }
        }

        for (String name : mapa.keySet()) {
            rsl.add(new Label(name, (double) mapa.get(name) / pupils.size()));
        }

        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();

        for (Pupil pupilZ : pupils) {
            int sum = 0;
            for (Subject subjectZ : pupilZ.subject()) {
                sum += subjectZ.score();
            }
            rsl.add(new Label(pupilZ.name(), sum));
        }
        rsl.sort(Comparator.naturalOrder());

        return rsl.get(rsl.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        List<Label> rsl = new ArrayList<>();

        for (Pupil pupilZ : pupils) {
            for (Subject subjectZ : pupilZ.subject()) {
                mapa.put(subjectZ.name(), mapa.getOrDefault(subjectZ.name(), 0) + subjectZ.score());
            }
        }

        for (String name : mapa.keySet()) {
            rsl.add(new Label(name, mapa.get(name)));
        }
        rsl.sort(Comparator.naturalOrder());

        return rsl.get(rsl.size() - 1);
    }
}
