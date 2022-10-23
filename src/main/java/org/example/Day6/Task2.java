package org.example.Day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("BMW", 2020, 30, 40000 );
        airplane.setYear(2021);
        airplane.setLength(5000);
        airplane.fillUp(56);
        airplane.fillUp(500);
        airplane.info();
    }
}
