package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.templateMethod.BurgerTemplate;
import com.example.behavioralPatterns.templateMethod.Cheeseburger;
import com.example.behavioralPatterns.templateMethod.Chefburger;
import com.example.patternExamples.Interfaces.PatternExample;

public class TemplateMethodExample implements PatternExample {

    @Override
    public void runExample() {
        BurgerTemplate cheeseburger = new Cheeseburger();
        BurgerTemplate chefburger = new Chefburger();

        System.out.println("Чизбургер:");
        // Добавлено 2 булки
        // Добавлен сыр, курочка и лук
        // Завернуто и подано к столу
        cheeseburger.prepareBurger();

        System.out.println("\nШефбургер:");
        // Добавлено 2 булки
        // Добавлена говядина, капуста и соус
        // Завернуто и подано к столу
        chefburger.prepareBurger();
    }
}
