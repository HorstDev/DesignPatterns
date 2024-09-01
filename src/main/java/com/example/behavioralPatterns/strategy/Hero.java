package com.example.behavioralPatterns.strategy;

// Реализация паттерна стратегия. В итоге соблюдается принцип open-closed
// (можем добавлять новые оружия (стратегии), при этом не изменяя класс)
public class Hero {
    public void attack(Weapon weapon) {
        weapon.shoot();
    }
}
