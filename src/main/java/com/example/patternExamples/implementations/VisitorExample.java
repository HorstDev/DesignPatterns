package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.visitor.*;
import com.example.patternExamples.Interfaces.PatternExample;

import java.util.Arrays;
import java.util.List;

public class VisitorExample implements PatternExample {

    @Override
    public void runExample() {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square());

        IShapeVisitor measurementVisitor = new MeasurementVisitor();

        // Для каждой фигуры вычисляем ее площадь
        for (Shape shape : shapes) {
            shape.accept(measurementVisitor);
        }
    }
}
