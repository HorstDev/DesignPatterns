package com.example.generatingPatterns.abstractFactory;

import com.example.generatingPatterns.abstractFactory.furniture.chairs.ModernChair;
import com.example.generatingPatterns.abstractFactory.furniture.interfaces.Chair;
import com.example.generatingPatterns.abstractFactory.furniture.interfaces.Table;
import com.example.generatingPatterns.abstractFactory.furniture.tables.ModernTable;

// Конкретная фабрика (современная мебель)
public class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Table createTable() {
        return new ModernTable();
    }
}
