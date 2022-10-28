package org.example.Day14;

import java.util.ArrayList;
import java.util.List;

/**
 Методы:

 - public static void showDialog(User u1, User u2) - этот метод
 должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат
 вывода должен быть таким:
 user1: Привет!
 user2: Привет, user1!
 user1: Как у тебя дела?
 user2: Все ок, спасибо :)
 * У вас могут быть любые другие сообщения. Где user1 и user2 - имена
 пользователей u1 и u2. **/
public class MessageDatabase {
   private  static List<Message> messages = new ArrayList<>();
   public static void sendMessage(User u1, User u2, String text){
      messages.add(new Message(u1, u2, text));
   }

   public static void showDialog(User u1, User u2) {
      for(Message message : messages) {
         if(message.getSender() == u1 && message.getReceiver() == u2
         || message.getSender() == u2 && message.getReceiver() == u1) {
            System.out.println(message.getSender() + " : " + message.getText());
         }
      }
   }
}
