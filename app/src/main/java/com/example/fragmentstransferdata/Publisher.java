package com.example.fragmentstransferdata;

import java.util.ArrayList;
import java.util.List;

// Обработчик подписок
public class Publisher {

    private List<Observer> observers;   // Все подписчики (Fragment1, Fragment2)

    public Publisher() {
        observers = new ArrayList<>();
    }

    // Подписать кого-то на событие, то есть сохранить в список с подписчиками
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    // Отписать
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    // Разослать событие по подписчикам (изменение в тексте)
    public void notify(String text) {
        for (Observer observer : observers) {
            observer.updateText(text);
        }
    }
}
