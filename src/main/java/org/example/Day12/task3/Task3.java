package org.example.Day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** *Выполнять в подпапке task3 в day12*
 Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 (название музыкальной группы и год основания). Создать 10 или более экземпляров
 класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 список. Создать статический метод в классе Task3:
 public static List<MusicBand> groupsAfter2000(List<MusicBand>
 bands)
 Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 состоящий из групп, основанных после 2000 года. Вызвать метод
 groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 после 2000 года). **/
public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("CHURCH", 2020);
        MusicBand band2 = new MusicBand("Pet Shop Boys", 2000);
        MusicBand band3 = new MusicBand("Slade", 1990);
        MusicBand band4 = new MusicBand("Uriah Heep", 1980);
        MusicBand band5 = new MusicBand("Poison", 2020);
        MusicBand band6 = new MusicBand("Twisted Sister", 2010);
        MusicBand band7 = new MusicBand("Quiet Riot", 2006);
        MusicBand band8 = new MusicBand("Survivor", 2020);
        MusicBand band9 = new MusicBand("Alice In Chains", 2009);
        MusicBand band10 = new MusicBand("My Chemical Romance", 2008);
        MusicBand band11 = new MusicBand("Kansas", 2009);
        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);
        bands.add(band11);
        System.out.println(bands);
        Collections.shuffle(bands);
        System.out.println(bands);


        List<MusicBand> author2000 = new ArrayList<>();
        for(MusicBand musicBand : bands) {
            if(musicBand.getYear() > 2000) {
                author2000.add(musicBand);
            }
            System.out.println(author2000);
        }





    }
}
