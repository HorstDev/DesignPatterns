package com.example.structuralPatterns.decorator;

// Конкретный декоратор
public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(IBeverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + " Milk";
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost() + 0.5;
    }
}
