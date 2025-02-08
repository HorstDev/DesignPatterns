package com.example.structuralPatterns.decorator;

// Конкретный декоратор
public class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(IBeverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + " Sugar";
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost() + 0.2;
    }
}
