package ru.job4j.collection;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person keys : persons) {
            if (keys.getName().contains(key) || keys.getSurname().contains(key)
                    || keys.getPhone().contains(key) || keys.getAddress().contains(key)) {
                result.add(keys);
            }
        }
        return result;
    }
}