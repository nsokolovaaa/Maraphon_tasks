package org.example.Day6;

import java.util.Scanner;

/** В классах Автомобиль и Мотоцикл реализовать два метода:
 info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 yearDifference() - принимает на вход число (год), и возвращает разницу между
 переданным годом и годом выпуска транспортного средства  **/

public class Car5 {
   private int yearOfRealize;
    private String model;
    private String color;

    public Car5(int yearOfRealize, String model, String color) {
        this.yearOfRealize = yearOfRealize;
        this.model = model;
        this.color = color;
    }

    public Car5() {

    }

    public int getYear() {
        return yearOfRealize;
    }

    public void setYear(int year) {
        this.yearOfRealize = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void info() {
        System.out.println("This is car");

    }
    public int yearDifference(int yearOfInput){
        return  yearOfRealize - yearOfInput ;
    }

    }


