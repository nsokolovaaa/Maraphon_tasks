package org.example.Day12.task5;



import java.util.ArrayList;
import java.util.List;

/** Скопировать MusicBand из прошлого задания и доработать - теперь у участника
 музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
 участником понимается не строка, а объект класса MusicArtist. Необходимо
 реализовать класс MusicArtist и доработать класс MusicBand (создать копию
 класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
 этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
 проверить состав групп после слияния. Методы для слияния и для вывода участников
 в консоль необходимо тоже переработать, чтобы они работали с объектами класса
 MusicArtist**/
public class Task5 {
    public static void main(String[] args) {
    List<MusicArtist> members = new ArrayList<>();
    members.add(new MusicArtist("Rihanna", 25));
    members.add(new MusicArtist("John", 55));
    members.add(new MusicArtist("Kreed", 35));
    MusicBand band1 = new MusicBand("The Beatles", 56, members);


    List<MusicArtist> members2 = new ArrayList<>();
    members.add(new MusicArtist("Moon", 52));
    members.add(new MusicArtist("Lick", 55));
    members.add(new MusicArtist("Denis Rider", 35));
    MusicBand band2 = new MusicBand("The Beatles", 56, members2);
    band1.printMembers();
    band2.printMembers();
    MusicBand.transferMembers(band1, band2);
    band1.printMembers();
    band2.printMembers();







    }

}

