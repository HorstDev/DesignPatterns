package com.example.GeneratingPatterns.AbstractFactory;

import com.example.GeneratingPatterns.AbstractFactory.furniture.chairs.BadChair;
import com.example.GeneratingPatterns.AbstractFactory.furniture.interfaces.Chair;
import com.example.GeneratingPatterns.AbstractFactory.furniture.interfaces.Table;
import com.example.GeneratingPatterns.AbstractFactory.furniture.tables.BadTable;

// Конкретная фабрика (плохая мебель)
public class BadFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new BadChair();
    }

    public Table createTable() {
        return new BadTable();
    }
}
