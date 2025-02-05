package com.example.behavioralPatterns.visitor;

public class MeasurementVisitor implements IShapeVisitor {
    public void visit(Circle circle)
    {
        // Логика измерения круга, например

        //double area = Math.PI * Math.Pow(circle.Radius, 2);
        //Console.WriteLine($"Площадь круга = {area}");
        System.out.println("Вычислена площадь круга");
    }

    public void visit(Square square)
    {
        // Логика измерения квадрата, например

        //double area = circle.Width * circle.Height;
        //Console.WriteLine($"Площадь квадрата = {area}");
        System.out.println("Вычислена площадь квадрата");
    }
}
