package org.example.Day3;
/** . Реализовать программу, которая пока работает, принимает на вход от пользователя
 два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
 результат деления и выводит его в консоль. Программа останавливает свою работу
 тогда, когда пользователь вводит 0 в качестве делителя.
 (для этих вещественных чисел необходимо использовать тип double и метод
 nextDouble() у Scanner’а соответственно). **/
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите делимое число ");
            double a = scanner.nextDouble();
            System.out.println("Введите делитель ");
            double b = scanner.nextDouble();
            if (b == 0)
                break;
            System.out.println(a / b);


        }
    }
}