package com.example.behavioralPatterns.visitor;

public interface IShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
}
