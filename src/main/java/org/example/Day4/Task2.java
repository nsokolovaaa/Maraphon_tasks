package org.example.Day4;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;
/** Создать новый массив размера 100 и заполнить его случайными числами из
 диапазона от 0 до 10000.
 Затем, используя циклы for each вывести:
 - наибольший элемент массива
 - наименьший элемент массива
 - количество элементов массива, оканчивающихся на 0
 - сумму элементов массива, оканчивающихся на 0
 Использовать сортировку запрещено. **/

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        int max = 0;
        for (int x : array) {
            if (x > max)
                max = x;
        }
        System.out.println(max);
        int min = 10000;
        for (int x : array) {
            if (x < min)
                min = x;
        }
        System.out.println(min);
        int counter = 0;
        for (int x : array) {
            if (x % 10 == 0)
                counter++;
            }
            System.out.println(counter);
        int sum = 0;
        for (int x : array) {
            if (x % 10 == 0)
                sum += x;
        }
            System.out.println(sum);
        }
    }

