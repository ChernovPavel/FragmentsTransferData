package com.example.fragmentstransferdata;

// Наблюдатель, вызывается updateText, когда надо отправить событие по изменению текста
public interface Observer {
    void updateText(String text);
}
