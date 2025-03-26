package ru.job4j.stream;

import java.util.*;

import ru.job4j.stream.mapto.Person;

public class MinExampleMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        Optional<Person> youngestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));
        Optional<Person> oldestPerson = people.stream()
                .max(Comparator.comparing(Person::getAge));
        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();
        double result = average.getAsDouble();
        int ageMin = youngestPerson.get().getAge();
        int ageMax = oldestPerson.get().getAge();
        int sum = people.stream()
                        .mapToInt(Person::getAge)
                                .sum();
        System.out.println("Min age: " + ageMin + " | Max Age: " + ageMax);
        System.out.println("Average age: " + result);
        System.out.println("Sum age: " + sum);
    }
}
