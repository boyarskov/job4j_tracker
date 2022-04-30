package ru.job4j.collection.tasks.set;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class UniqueName {
    public static int collectUniqueName(List<User> users) {
        HashSet<String> usersHash = new HashSet<>();

        for (User uni : users) {
            usersHash.add(uni.getName());
        }
        int rsl = usersHash.size();
        return rsl;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

    }
}