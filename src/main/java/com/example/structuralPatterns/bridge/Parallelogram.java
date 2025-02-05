package com.example.structuralPatterns.bridge;

// Конкретная абстракция
public class Parallelogram extends Shape {

    public Parallelogram(IShapeImplementation implementation) {
        super(implementation);
    }

    @Override
    public void draw() {
        shapeImplementation.draw();
    }
}
