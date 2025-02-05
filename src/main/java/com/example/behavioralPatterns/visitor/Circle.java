package com.example.behavioralPatterns.visitor;

public class Circle extends Shape {

    @Override
    public void accept(IShapeVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public void draw() { }
}
