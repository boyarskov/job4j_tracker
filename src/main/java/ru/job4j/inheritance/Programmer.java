package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String stack;

    public Programmer(String name, String surname, String education, String branch, String stack) {
        super(name, surname, education, branch);
        this.stack = stack;
    }

    public void printStack() {
        System.out.println("Stack technology: " + stack);
    }

    public static void main(String[] args) {
        Programmer junior = new Programmer("Anastasia", "Ivanova", "MGU", "Horeca", "C++, Go");
        junior.getName();
        junior.getSurname();
        junior.getEducation();
        junior.getBranch();
        junior.printStack();
        System.out.println();
        Programmer middle = new Programmer("Artem", "Boyarskov", "UNN", "Fintech", "Java");
        middle.getName();
        middle.getSurname();
        middle.getEducation();
        middle.getBranch();
        middle.printStack();
        System.out.println();
    }
}
