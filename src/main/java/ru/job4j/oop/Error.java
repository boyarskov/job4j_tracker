package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public void printInfo() {
        System.out.println("Error: " + active);
        System.out.println("Label: " + status);
        System.out.println("Description: " + message);
    }

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error errorBad = new Error(true, 400, "Bad Request");
        errorBad.printInfo();
        Error errorNot = new Error(true, 404, "Not Found");
        errorNot.printInfo();

    }
}
