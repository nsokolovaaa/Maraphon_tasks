package org.example.Day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Uvanov Ivan", "Geography");
        Student student = new Student("Sokolova Kate");
        teacher.evaluate(student);
    }
}
