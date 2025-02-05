package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.observer.SiteWithVacancies;
import com.example.behavioralPatterns.observer.Subscriber;
import com.example.patternExamples.Interfaces.PatternExample;

public class ObserverExample implements PatternExample {

    @Override
    public void runExample() {
        // Наблюдатели
        Subscriber subscriber1 = new Subscriber("Вася");
        Subscriber subscriber2 = new Subscriber("Петя");
        Subscriber subscriber3 = new Subscriber("Дима");

        // Наблюдаемый
        SiteWithVacancies siteWithVacancies = new SiteWithVacancies();

        // Добавляем наблюдателей
        siteWithVacancies.addObserver(subscriber1);
        siteWithVacancies.addObserver(subscriber2);
        siteWithVacancies.addObserver(subscriber3);

        // Добавляем вакансии, о которых будут уведомлены подписчики
        System.out.println("Добавляем вакансию №1...");
        siteWithVacancies.addVacancy("Вакансия №1");
        System.out.println("\nДобавляем вакансию №2...");
        siteWithVacancies.addVacancy("Вакансия №2");
    }
}
