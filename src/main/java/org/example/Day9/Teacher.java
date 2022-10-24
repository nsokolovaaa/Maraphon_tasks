package org.example.Day9;

public class Teacher extends Human{
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    String subject;
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
    public void  printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + name);
    }
}
