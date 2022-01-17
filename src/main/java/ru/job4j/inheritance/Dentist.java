package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int price;

    public Dentist(String name, String surname, String education, String specialization, int price) {
        super(name, surname, education, specialization);
        this.price = price;
    }

    public int getPrice() {
        System.out.println("Price: " + this.price + "$");
        return price;
    }

    public static void main(String[] args) {
        Dentist freeDoctor = new Dentist("Maria", "Grach", "MGU", "paradontologist", 100);
        freeDoctor.getName();
        freeDoctor.getSurname();
        freeDoctor.getEducation();
        freeDoctor.getSpecialization();
        freeDoctor.getPrice();
    }
}