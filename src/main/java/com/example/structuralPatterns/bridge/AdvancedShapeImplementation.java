package com.example.structuralPatterns.bridge;

// Конкретная реализация
public class AdvancedShapeImplementation implements IShapeImplementation {

    @Override
    public void draw() {
        System.out.println("Рисование сложной фигуры");
    }
}
