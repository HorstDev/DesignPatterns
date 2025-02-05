package com.example.structuralPatterns.bridge;

// Конкретная абстракция
public class Rhombus extends Shape {

    public Rhombus(IShapeImplementation implementation) {
        super(implementation);
    }

    @Override
    public void draw() {
        shapeImplementation.draw();
    }
}
