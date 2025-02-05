package com.example.structuralPatterns.bridge;

// Абстракция
public abstract class Shape {

    protected IShapeImplementation shapeImplementation;

    protected Shape(IShapeImplementation shapeImplementation) {
        this.shapeImplementation = shapeImplementation;
    }

    public abstract void draw();
}
