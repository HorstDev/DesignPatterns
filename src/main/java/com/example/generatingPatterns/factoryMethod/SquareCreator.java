package com.example.generatingPatterns.factoryMethod;

import com.example.generatingPatterns.factoryMethod.shapes.Shape;
import com.example.generatingPatterns.factoryMethod.shapes.Square;

// Конкретный создатель (квадрат)
public class SquareCreator implements ShapeCreator {

    @Override
    public Shape createShape() {
        return new Square();
    }
}
