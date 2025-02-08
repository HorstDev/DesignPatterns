package com.example.patternExamples.implementations;

import com.example.patternExamples.Interfaces.PatternExample;
import com.example.structuralPatterns.composite.Circle;
import com.example.structuralPatterns.composite.FigureContainer;
import com.example.structuralPatterns.composite.IFigure;
import com.example.structuralPatterns.composite.Square;

public class CompositeExample implements PatternExample {

    public void runExample() {
        IFigure circle = new Circle();
        IFigure square = new Square();

        // Создаем контейнер и добавляем в него фигуры
        var figuresContainer = new FigureContainer();
        figuresContainer.addFigure(circle);
        figuresContainer.addFigure(square);

        // Создаем второй контейнер, добалвяем в него фигуры и добавляем этот контейнер в первый контейнер
        var secondFiguresContainer = new FigureContainer();
        secondFiguresContainer.addFigure(circle);
        secondFiguresContainer.addFigure(circle);
        figuresContainer.addFigure(secondFiguresContainer);

        figuresContainer.draw();
    }
}
