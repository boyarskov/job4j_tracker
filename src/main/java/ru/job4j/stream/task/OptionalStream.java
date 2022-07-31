package ru.job4j.stream.task;

import java.util.List;
import java.util.stream.Collectors;

public class OptionalStream {

    public static class PhoneNumber {

        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

    }

    public static class User {

        private int id;

        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
        return users.stream()
                .filter(findId -> findId.getId() == id)
                .flatMap(u -> u.getNumbers().stream())
                .filter(u -> u.getPhone().startsWith(region))
                .collect(Collectors.toList());
    }

}
