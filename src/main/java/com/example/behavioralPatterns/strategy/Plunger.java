package com.example.behavioralPatterns.strategy;

public class Plunger implements Weapon {

    @Override
    public void shoot() {
        System.out.println("Произошла атака вантузом");
    }
}
