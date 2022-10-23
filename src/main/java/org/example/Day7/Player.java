package org.example.Day7;

public class Player {
    int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }
        public  void run(){
        if(stamina ==0)
            stamina--;
        if(stamina ==0) {
            countPlayers--;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }


    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }
    public static void info(){
        if(countPlayers<6) {
            System.out.println("Команды не полные и есть " + (6-countPlayers) +" свободные места");
        }else {
            System.out.println("Мест в команде больше нет");
        }
    }

}
