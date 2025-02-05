package com.example.behavioralPatterns.templateMethod;

public abstract class BurgerTemplate {

    // Шаблонный метод
    // Здесь "Добавить 2 булки" и "Завернуть и подать к столу" одинаковы для всех бургеров, а "Добавить продукты" - уникален
    public void prepareBurger() {
        addTwoRolls();      // Добавить 2 булки
        addProducts();      // Добавить продукты (этот метод как раз и изменяется подклассами, так как он уникален для каждого бургера)
        wrapAndServe();     // Завернуть и подать к столу
    }

    // Метод, который будет доступен для переопределения подклассам
    protected abstract void addProducts();

    protected void addTwoRolls() {
        System.out.println("Добавлены две булки");
    }

    protected void wrapAndServe() {
        System.out.println("Бургер завернут и подан к столу");
    }
}
