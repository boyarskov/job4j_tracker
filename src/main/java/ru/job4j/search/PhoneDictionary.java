package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> correctName = p -> p.getName().contains(key);
        Predicate<Person> correctSurName = p -> p.getSurname().contains(key);
        Predicate<Person> correctPhone = p -> p.getPhone().contains(key);
        Predicate<Person> correctAdress = p -> p.getAddress().contains(key);
        Predicate<Person> combine = correctName.or(correctSurName.or(correctPhone.or(correctAdress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}