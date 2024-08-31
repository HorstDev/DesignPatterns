package com.example.GeneratingPatterns.FactoryMethod;

import com.example.GeneratingPatterns.FactoryMethod.shapes.Circle;
import com.example.GeneratingPatterns.FactoryMethod.shapes.Shape;

// Конкретный создатель (круг)
public class CircleCreator implements ShapeCreator {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
