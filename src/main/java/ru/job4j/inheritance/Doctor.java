package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String specialization;

    public Doctor(String name, String surname, String education, String specialization) {
        super(name, surname, education);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        System.out.println("Specialization: " + this.specialization);
        return specialization;
    }
}
