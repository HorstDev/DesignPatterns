package com.example.structuralPatterns.bridge;

// Конкретная реализация
public class SimpleShapeImplementation implements IShapeImplementation {

    @Override
    public void draw() {
        System.out.println("Рисование простой фигуры");
    }
}
