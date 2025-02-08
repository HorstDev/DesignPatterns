package com.example.structuralPatterns.composite;

public class Circle implements IFigure {

    @Override
    public void draw() {
        System.out.println("Нарисован круг");
    }
}
