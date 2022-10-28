package org.example.Day14;

import java.util.Date;

/**

 Методы:

 - Метод toString(), который возвращает строковое представление сообщения
 в таком формате:
 FROM: 'Имя отправителя'
 TO: 'Имя получателя'
 ON: Sun Aug 30 19:07:34 MSK 2020
 'Текст сообщения'
 *в поле ON должна быть дата создания объекта класса Message**/
public class Message {
    User sender;
    User receiver;
    String text;
    Date date;

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Имя отправителя"  + sender +
                ",TO:" + receiver +
                ",  ON:" + date +
                ", Текст сообщения'" + text + '\'' +
                '}';
    }
}
