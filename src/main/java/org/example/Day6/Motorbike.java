package org.example.Day6;
/** В классах Автомобиль и Мотоцикл реализовать два метода:
 info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 yearDifference() - принимает на вход число (год), и возвращает разницу между
 переданным годом и годом выпуска транспортного средства   **/
public class Motorbike {
     private int yearOfRealize;
     private String color;
     private String model;

    public Motorbike(int yearOfRealize, String color, String model) {
        this.yearOfRealize = yearOfRealize;
        this.color = color;
        this.model = model;
    }

    public int getYearOfRealize() {
        return yearOfRealize;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
    public void info() {
        System.out.println("This is motorbike");

    }
    public int yearDifference(int yearOfInput){
        return  yearOfRealize - yearOfInput;
    }
}

