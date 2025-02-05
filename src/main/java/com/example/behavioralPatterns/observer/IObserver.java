package com.example.behavioralPatterns.observer;

import java.util.List;

// Наблюдатель
public interface IObserver {
    void handleEvent(List<String> vacancies);
}
