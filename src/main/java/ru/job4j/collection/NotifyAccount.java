package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>(accounts);
        for (Account result : rsl) {
            rsl.add(result);
            System.out.println(rsl);
        }
        return rsl;
    }
}
