package org.example.Day4;
/**  С клавиатуры вводится число n - размер массива. Необходимо создать массив
 указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 содержимое массива в консоль, а также вывести в консоль информацию о:
 а) Длине массива
 б) Количестве чисел больше 8
 в) Количестве чисел равных 1
 г) Количестве четных чисел
 д) Количестве нечетных чисел
 е) Сумме всех элементов массива  **/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int arrayLenght = scanner.nextInt();
        Random random = new Random();
        random.nextInt(10);
        int[] array = new int[arrayLenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        int counter = 8;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                counter++;
        }
        System.out.println(counter);
        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                counter1++;
        }
        System.out.println(counter1);
        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counterEven++;
        }
        System.out.println(counterEven);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                count++;
        }
        System.out.println(count);

        int sum = 0;
        for (int i = 0; i < arrayLenght; i++) {
            sum += arrayLenght;
        }
        System.out.println(sum);


    }
}

