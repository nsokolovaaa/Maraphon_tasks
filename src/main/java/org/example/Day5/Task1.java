package org.example.Day5;


public class Task1  {

    public static void main(String[] args) {
        Car5 car = new Car5 ();
        car.setColor("black");
        car.setYear(2022);
        car.setModel("BMW");
        System.out.println("New Car: " + car.getModel() + " " + car.getColor() + " " + car.getYear());

    }
}
