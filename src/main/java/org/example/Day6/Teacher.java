package org.example.Day6;

import java.util.Random;

/** Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать
 класс Student (Студент) с полем “Имя”.
 Каждый класс имеет конструктор (с параметрами), set и get методы по
 необходимости, а также у преподавателя есть метод evaluate (оценить студента),
 принимающий в качестве аргумента студента, и работающий следующим образом:
 внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
 "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
 по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
 Все слова, написанные большими буквами, должны быть заменены
 соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
 "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
 значения случайного числа.
 Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки
 студента, передав студента в качестве аргумента метода**/
public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void evaluate(Student student) {
        String evalution = "";
        Random random = new Random();
        int randomValue = random.nextInt(4) +2;
        switch (randomValue) {
            case 2 :evalution = "неудовлетворительно";
            break;
            case 3: evalution = "удовлетворительно";
            break;
            case 4: evalution = "хорошо";
            break;
            case 5: evalution = "отлично";
                break;
        }
        System.out.println("Преподаватель "+ this.name + " оценил студента с именем " +student.getName()+ "\n" +
                " по предмету " + this.subject +" на оценку " +evalution);
    }
}
