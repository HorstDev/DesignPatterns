package com.example.GeneratingPatterns.FactoryMethod;

import com.example.GeneratingPatterns.FactoryMethod.shapes.Shape;
import com.example.GeneratingPatterns.FactoryMethod.shapes.Square;

// Конкретный создатель (квадрат)
public class SquareCreator implements ShapeCreator {

    @Override
    public Shape createShape() {
        return new Square();
    }
}
