package org.example.Day9;

public class Student extends Human{
    String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void  printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем  " + name);
    }
}
