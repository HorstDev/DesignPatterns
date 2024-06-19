package com.example.patternExamples.implementations;

import com.example.GeneratingPatterns.Singleton.Singleton;
import com.example.patternExamples.Interfaces.PatternExample;

public class SingletonExample implements PatternExample {
    public void runExample() {
        System.out.println("Порождающий паттерн Singleton (одиночка) - позволяет создавать объект в единственном экземпляре");
        // Создаем первый экземпляр singleton
        Singleton singleton = Singleton.getInstance();
        System.out.println("Создан первый экземпляр singleton");
        System.out.println("hashCode созданного объекта - " + singleton.hashCode());

        // Создаем второй экземпляр singleton
        singleton = Singleton.getInstance();
        System.out.println("Создан второй экземпляр singleton");
        System.out.println("hashCode созданного объекта - " + singleton.hashCode());

        System.out.println("hashCode для двух объектов будет одинаковым, т.к. это один и тот же объект");
    }
}
