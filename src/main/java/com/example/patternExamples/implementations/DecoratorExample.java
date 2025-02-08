package com.example.patternExamples.implementations;

import com.example.patternExamples.Interfaces.PatternExample;
import com.example.structuralPatterns.decorator.Coffee;
import com.example.structuralPatterns.decorator.IBeverage;
import com.example.structuralPatterns.decorator.MilkDecorator;
import com.example.structuralPatterns.decorator.SugarDecorator;

public class DecoratorExample implements PatternExample {

    @Override
    public void runExample() {
        IBeverage coffee = new Coffee();

        // Декорируем кофе добавками
        IBeverage coffeeWithMilk = new MilkDecorator(coffee);
        IBeverage coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);

        System.out.println("Кофе: " + coffee.getDescription() + ", цена: " + coffee.getCost());
        System.out.println("Кофе с молоком: " + coffeeWithMilk.getDescription() + ", цена: " + coffeeWithMilk.getCost());
        System.out.println("Кофе с молоком и сахаром: " + coffeeWithMilkAndSugar.getDescription() + ", цена: " + coffeeWithMilkAndSugar.getCost());
    }
}
