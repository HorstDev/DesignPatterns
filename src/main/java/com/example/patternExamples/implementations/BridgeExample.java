package com.example.patternExamples.implementations;

import com.example.patternExamples.Interfaces.PatternExample;
import com.example.structuralPatterns.bridge.*;

public class BridgeExample implements PatternExample {

    @Override
    public void runExample() {
        IShapeImplementation simpleImplementation = new SimpleShapeImplementation();
        IShapeImplementation advancedImplementation = new AdvancedShapeImplementation();

        // Создаем разные абстракции с разными реализациями (для ромба простая реализация, для параллелограмма сложная)
        Shape rhombus = new Rhombus(simpleImplementation);
        Shape parallelogram = new Parallelogram(advancedImplementation);

        rhombus.draw();         // Рисование простой фигуры
        parallelogram.draw();   // Рисование сложной фигуры
    }
}
