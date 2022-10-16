package org.example.Day1;
/**Обьявите переменную типа int, имя переменной k.Присвойте этой переменной значение от 1 до 9. Используя цикл, выведете в консоль таблицу умножения
 * для этой цифры **/
public class Task6 {
    public static void main(String[] args) {
        int k = 4;
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "x" + k +" =" + i*k);
        }
    }
}
