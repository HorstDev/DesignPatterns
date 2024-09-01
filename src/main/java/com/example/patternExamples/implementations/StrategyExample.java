package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.strategy.Hero;
import com.example.behavioralPatterns.strategy.Plunger;
import com.example.behavioralPatterns.strategy.WaterGun;
import com.example.behavioralPatterns.strategy.Weapon;
import com.example.patternExamples.Interfaces.PatternExample;

public class StrategyExample implements PatternExample {

    @Override
    public void runExample() {
        Hero hero = new Hero();

        System.out.println("Атакуем с помощью водного пистолета");
        Weapon weapon = new WaterGun();
        hero.attack(weapon);

        System.out.println("Изменили оружие на вантуз и атакуем");
        weapon = new Plunger();
        hero.attack(weapon);
    }
}
