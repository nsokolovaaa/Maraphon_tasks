package org.example.Day12.task3;
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
public class MusicBand {
    String name;
    int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
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

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
