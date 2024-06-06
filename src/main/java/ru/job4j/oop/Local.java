package ru.job4j.oop;

public class Local {
    private String name = "Artem";

    public void getFullName() {
        final String surname = "Boyarskov";

        class FullMane {
            public void printFullName() {
                System.out.println(name + " " + surname);
            }
        }
        FullMane fullMane = new FullMane();
        fullMane.printFullName();
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.getFullName();
    }
}
