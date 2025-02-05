package com.example.behavioralPatterns.observer;

import java.util.List;

// Подписчик (наблюдатель)
public class Subscriber implements IObserver {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void handleEvent(List<String> vacancies) {
        System.out.println("Подписчик " + name + " получил уведомление об обновленных вакансиях");
        // ....
    }
}
