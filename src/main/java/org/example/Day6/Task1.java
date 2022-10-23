package org.example.Day6;

public class Task1 {
    public static void main(String[] args) {

        Car5 car5 = new Car5(2022, "Yellow", "Bmw");
        car5.info();
        System.out.println(car5.yearDifference(2021));

        Motorbike motorbike = new Motorbike(2022, "Black", "Mersedes");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2020));



    }
}