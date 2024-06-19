package com.example.patternExamples.implementations;

import com.example.GeneratingPatterns.AbstractFactory.BadFurnitureFactory;
import com.example.GeneratingPatterns.AbstractFactory.FurnitureFactory;
import com.example.GeneratingPatterns.AbstractFactory.ModernFurnitureFactory;
import com.example.GeneratingPatterns.AbstractFactory.furniture.interfaces.Chair;
import com.example.GeneratingPatterns.AbstractFactory.furniture.interfaces.Table;
import com.example.patternExamples.Interfaces.PatternExample;

public class AbstractFactoryExample implements PatternExample {
    public void runExample() {
        System.out.println("Создаем стулья и столы с помощью плохой фабрики:");
        FurnitureFactory furnitureFactory = new BadFurnitureFactory();
        Chair chair = furnitureFactory.createChair();
        Table table = furnitureFactory.createTable();

        System.out.println("Созданный стул - " + chair.getClass().getSimpleName());
        System.out.println("Созданный стол - " + table.getClass().getSimpleName());

        System.out.println("\nМеняем фабрику на современную:");
        furnitureFactory = new ModernFurnitureFactory();
        chair = furnitureFactory.createChair();
        table = furnitureFactory.createTable();

        System.out.println("Созданный стул - " + chair.getClass().getSimpleName());
        System.out.println("Созданный стол - " + table.getClass().getSimpleName());
    }
}
