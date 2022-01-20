package pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent("Artem Boyarskov");
        student.setGroup("118-A");
        student.setAdmission(new Date());

        System.out.println("Student: " + student.getStudent() + " admission " + student.getAdmission() + " in group number: " + student.getGroup());
    }
}
