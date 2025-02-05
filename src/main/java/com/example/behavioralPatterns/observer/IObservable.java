package com.example.behavioralPatterns.observer;

// Наблюдаемый
public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}
