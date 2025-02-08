package com.example.structuralPatterns.decorator;

// Декоратор
public abstract class BeverageDecorator implements IBeverage {

    protected IBeverage decoratedBeverage;

    protected BeverageDecorator(IBeverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    public String getDescription() {
        return decoratedBeverage.getDescription();
    }

    public double getCost() {
        return decoratedBeverage.getCost();
    }
}
