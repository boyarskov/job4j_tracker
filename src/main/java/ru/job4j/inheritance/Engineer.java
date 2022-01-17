package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String branch;

    public Engineer(String name, String surname, String education, String branch) {
        super(name, surname, education);
        this.branch = branch;
    }

    public String getBranch() {
        System.out.println("Branch: " + this.branch);
        return branch;
    }
}
