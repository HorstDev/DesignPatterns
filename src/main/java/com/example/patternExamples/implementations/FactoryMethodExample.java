package com.example.patternExamples.implementations;

import com.example.generatingPatterns.factoryMethod.CircleCreator;
import com.example.generatingPatterns.factoryMethod.ShapeCreator;
import com.example.generatingPatterns.factoryMethod.SquareCreator;
import com.example.generatingPatterns.factoryMethod.shapes.Shape;
import com.example.patternExamples.Interfaces.PatternExample;

public class FactoryMethodExample implements PatternExample {

    @Override
    public void runExample() {
        System.out.println("Был выбран создатель кругов:");
        ShapeCreator shapeCreator = new CircleCreator();
        Shape shape = shapeCreator.createShape();
        shape.draw();

        System.out.println("Был выбран создатель квадратов:");
        shapeCreator = new SquareCreator();
        shape = shapeCreator.createShape();
        shape.draw();
    }
}
