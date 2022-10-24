package org.example.Day11;
/**

 Сотрудникам полагается бонус (индивидуальный расчет для каждого): когда на складе
 отгружен 1500-й заказ, заработанная к тому моменту ЗП сборщика утраивается. Когда
 складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
 Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему,
 вызовите у каждого методы doWork() и bonus(), столько раз, чтобы каждый из
 сотрудников получил бонус. Выведите в консоль баланс и количество выполненных
 заказов на складе и ЗП каждого из сотрудников.
 Создать второй склад, также принять по 1 сотруднику с однократным вызовом
 doWork() у каждого. Проконтролировать, что у склада 1 и его сотрудников при этом
 значения не меняются.  **/
public class Warehouse implements Worker {
    int countOrder;
    int balance;

    public Warehouse(int countOrder, int balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    public Warehouse() {

    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void doWork() {

    }

    @Override
    public void bonus() {

    }
}
