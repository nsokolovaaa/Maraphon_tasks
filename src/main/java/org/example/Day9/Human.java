package org.example.Day9;
/**

 Создайте в методе main() класса Task1 объект класса Студент и объект класса
 Преподаватель. Выведите в консоль название учебной группы у объекта-студента и
 название предмета у объекта-преподавателя. Затем, вызовите printInfo() на
 объектах и посмотрите на результат **/
public class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void  printInfo() {
        System.out.println("Этот человек с именем  " + name);
    }
}
