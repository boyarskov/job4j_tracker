package ru.job4j.inheritance;

public class Profession {

    private String name;
    private String surname;
    private String education;

    public Profession(String name, String surname, String education) {
        this.name = name;
        this.surname = surname;
        this.education = education;
    }

    public String getName() {
        System.out.println("Name: " + this.name);
        return name;
    }

    public String getSurname() {
        System.out.println("Surname: " + this.surname);
        return surname;
    }

    public String getEducation() {
        System.out.println("Education: " + this.education);
        return education;
    }

}
