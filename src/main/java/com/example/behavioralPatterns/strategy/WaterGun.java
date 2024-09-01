package com.example.behavioralPatterns.strategy;

public class WaterGun implements Weapon {

    @Override
    public void shoot() {
        System.out.println("Произошла атака водным пистолетом");
    }
}
