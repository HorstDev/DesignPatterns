package com.example.structuralPatterns.decorator;

// Конкретный компонент
public class Coffee implements IBeverage {

    public String getDescription() {
        return "Coffee";
    }

    public double getCost() {
        return 2.0;
    }
}
