package org.example.Day12;

import java.util.ArrayList;
import java.util.List;

/**Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 из списка. Распечатать список.
 **/
public class Car {
    public static void main(String[] args) {
         List<String>  cars = new ArrayList<>();
         cars.add("BMW");
         cars.add("AUDI");
         cars.add("RENO");
         cars.add("GEELY");
         cars.add("MERSEDES");
         System.out.println(cars);

         cars.add(2, "TOYOTA");
         System.out.println(cars);

         cars.remove(0);
         System.out.println(cars);




    }
    }
