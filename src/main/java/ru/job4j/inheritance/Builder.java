package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String profession;

    public Builder(String name, String surname, String education, String branch, String profession) {
        super(name, surname, education, branch);
        this.profession = profession;
    }

    public String getProfession() {
        System.out.println("Profession: " + this.profession);
        return profession;
    }

    public static void main(String[] args) {
        Builder reenactor = new Builder("Petr", "Fedorov", "NNGASU", "restoration of buildings", "reenactor");
        reenactor.getName();
        reenactor.getSurname();
        reenactor.getEducation();
        reenactor.getBranch();
        reenactor.getProfession();
    }
}
