package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI extends Item {

    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = formatter.format(item.getCreated());
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
