package ru.job4j.stream.task;

import java.util.List;
import java.util.stream.Collectors;

public class FilterObject {

    public static class User {

        private String name;

        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> filter(List<User> users) {
        return users
                .stream()
                .filter(name -> name.getName().startsWith("B"))
                .filter(age -> age.getAge() > 18)
                .collect(Collectors.toList());
    }
}
