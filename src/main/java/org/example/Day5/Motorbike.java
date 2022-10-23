package org.example.Day5;
/** Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
 “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
 консоль.  **/
public class Motorbike {
     private int yearOfRealize;
     private String color;
     private String model;

    public Motorbike(int yearOfRealize, String color, String model) {
        this.yearOfRealize = yearOfRealize;
        this.color = color;
        this.model = model;
    }

    public int getYearOfRealize() {
        return yearOfRealize;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}

