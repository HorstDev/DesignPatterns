package com.example.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

// Нааблюдаемый (сайт с вакансиями)
public class SiteWithVacancies implements IObservable {
    private final List<String> vacancies = new ArrayList<>();
    private final List<IObserver> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy)
    {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy)
    {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    public void addObserver(IObserver observer)
    {
        subscribers.add(observer);
    }

    public void removeObserver(IObserver observer)
    {
        subscribers.remove(observer);
    }

    public void notifyObservers()
    {
        for(var subscriber : subscribers) {
            subscriber.handleEvent(vacancies);
        }
    }
}
