package org.example.Day12;

import java.util.ArrayList;
import java.util.List;

/** Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
 Вывести список. **/
public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }

        }
        System.out.println(numbers);
    }
}