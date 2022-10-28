package org.example.Day14;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task14 {
    public static void main(String[] args) {
        User user = new User("user");
        User user2 = new User("user2");
        User user3 = new User("user3");
        user.sendMessage(user2, "hi");
        user2.sendMessage(user, "hello");
        user3.sendMessage(user, "good day");
        MessageDatabase.showDialog(user, user2);


    }
}
