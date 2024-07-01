package ru.job4j.varargs;

public class VarArgs {
    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }
        return builder + " Количество соединенных элементов: " + strings.length;
    }

    public static void main(String[] args) {
        System.out.println(text());
        System.out.println(text("aaa"));
        System.out.println(text("aaa", "bbb", "ccc"));
        System.out.println(text("aaa", "bbb", "ccc", "ddd", "eee"));
        System.out.println("test");
    }
}
