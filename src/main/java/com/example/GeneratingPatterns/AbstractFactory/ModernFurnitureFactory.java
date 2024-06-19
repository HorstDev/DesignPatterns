package com.example.GeneratingPatterns.AbstractFactory;

import com.example.GeneratingPatterns.AbstractFactory.furniture.chairs.ModernChair;
import com.example.GeneratingPatterns.AbstractFactory.furniture.interfaces.Chair;
import com.example.GeneratingPatterns.AbstractFactory.furniture.interfaces.Table;
import com.example.GeneratingPatterns.AbstractFactory.furniture.tables.ModernTable;

// Конкретная фабрика (современная мебель)
public class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Table createTable() {
        return new ModernTable();
    }
}
