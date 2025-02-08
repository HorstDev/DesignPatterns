package com.example.structuralPatterns.composite;

public class Square implements IFigure {

    @Override
    public void draw() {
        System.out.println("Нарисован квадрат");
    }
}
