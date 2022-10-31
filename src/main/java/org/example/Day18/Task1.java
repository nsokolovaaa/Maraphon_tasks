package org.example.Day18;

import org.example.Day17.ChessPiece;

import java.io.FileNotFoundException;

/** . Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом
 массиве не используя циклы (необходимо использовать рекурсивные вызовы).
 Пример:
 int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
 System.out.println(recursionSum(...)); // 65346
 *recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в
 массиве numbers.  **/
public class Task1 {
    public static void main(String[] args) {
      int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        System.out.println(sum(numbers, 0));



    }

    public static int sum(int[] numbers, int i) {
        if (i == numbers.length)
            return 0;
            return numbers[i] + sum(numbers, i + 1);

    }
    }
