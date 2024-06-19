package com.example.GeneratingPatterns.Singleton;

// Singleton (одиночка) - позволяет создавать объект в единственном экземпляре
public class Singleton {
    // Приватное поле, в котором хранится экземпляр singleton
    private static Singleton instance;

    // Конструктор приватный, чтобы можно было создать объект только через getInstance()
    private Singleton() {

    }

    // С помощью getInstance() получаем экземпляр объекта
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
