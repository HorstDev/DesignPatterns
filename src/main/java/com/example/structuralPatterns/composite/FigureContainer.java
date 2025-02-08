package com.example.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class FigureContainer implements IFigure {

    List<IFigure> figures = new ArrayList<>();

    public void addFigure(IFigure figure) {
        figures.add(figure);
    }

    @Override
    public void draw() {
        for (IFigure figure : figures) {
            figure.draw();
        }
    }
}
