package com.example.fragmentstransferdata;

import java.util.ArrayList;
import java.util.List;

// Обработчик подписок
public class Publisher {

    private List<Observer> subscribers;   // Все подписчики (Fragment1, Fragment2)

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    // Подписать кого-то на событие, то есть сохранить в список с подписчиками
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    // Отписать
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    // Разослать событие по подписчикам (изменение в тексте)
    public void notifyObservers(String text) {
        for (Observer observer : subscribers) {
            observer.handleAction(text);
        }
    }
}
