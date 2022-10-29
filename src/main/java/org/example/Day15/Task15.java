package org.example.Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/** Необходимо сформировать новый файл
 (src/main/resources/missing_shoes.txt) с информацией о моделях и
 размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте
 программу, которая принимает на вход csv файл и создает новый txt файл
 следующего содержания (должно получиться 11 строк):
 Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 ...  **/
public class Task15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\USER\\Desktop\\Maraphon_tasks\\src\\main\\resources\\shoes.csv");
        Scanner scanner = new Scanner(file);
        File fileOut = new File("C:\\Users\\USER\\Desktop\\Maraphon_tasks\\src\\main\\resources\\missing_shoes.txt");
        PrintWriter pw = new PrintWriter(fileOut);

        while (scanner.hasNextLine()) {
            String[] arr = scanner.nextLine().split(";");
            if(Integer.parseInt(arr[2]) == 0) {
                pw.println(arr[0] + ". " + arr[1]+ "," + arr[2]);
            }

        }
        pw.close();
        scanner.close();

    }
    }
