package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
                if (key.equals(value[i])) {
                    System.out.println("Key is found");
                    return i;
            }
            }
        throw new ElementNotFoundException("Key not found");
    }

    public static void main(String[] args) {
        String[] storage = {"1234", "qwerty", "qwerty0987", "pass", "pass564"};
        try {
            indexOf(storage, "qwerty");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}