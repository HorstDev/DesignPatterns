package com.example.generatingPatterns.factoryMethod;

import com.example.generatingPatterns.factoryMethod.shapes.Circle;
import com.example.generatingPatterns.factoryMethod.shapes.Shape;

// Конкретный создатель (круг)
public class CircleCreator implements ShapeCreator {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
