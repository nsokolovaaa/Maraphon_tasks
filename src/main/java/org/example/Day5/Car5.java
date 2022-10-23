package org.example.Day5;
/** Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 Созданный вами класс должен отвечать принципам инкапсуляции. **/

public class Car5 {
   private int year;
    private String model;
    private String color;

    public Car5(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Car5() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
