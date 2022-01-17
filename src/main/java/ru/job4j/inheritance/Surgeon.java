package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int experience;

    public Surgeon(String name, String surname, String education, String specialization, int experience) {
        super(name, surname, education, specialization);
        this.experience = experience;
    }

    public int getExperience() {
        System.out.println("Experience: " + this.experience + " years");
        return experience;
    }

    public static void main(String[] args) {
        Surgeon oldDoctor = new Surgeon("Anton", "Morozov", "NNGASU", "Cardiac Surgeon", 20);
        oldDoctor.getName();
        oldDoctor.getSurname();
        oldDoctor.getEducation();
        oldDoctor.getSpecialization();
        oldDoctor.getExperience();
    }
}
