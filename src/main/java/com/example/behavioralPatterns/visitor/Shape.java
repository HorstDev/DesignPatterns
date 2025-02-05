package com.example.behavioralPatterns.visitor;

public abstract class Shape {
    // Метод для посетителя, чтобы мы могли с помощью посетителя реализовывать новый функционал
    public abstract void accept(IShapeVisitor visitor);

    public abstract void draw();
}
