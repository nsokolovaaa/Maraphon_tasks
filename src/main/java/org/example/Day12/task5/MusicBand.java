package org.example.Day12.task5;

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
public class MusicBand {
    String name;
    int year;
    List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }
    public static void transferMembers(MusicBand a, MusicBand b){
        for( MusicArtist member : a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }
  public void printMembers(){
      System.out.println(this.members);
  }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
