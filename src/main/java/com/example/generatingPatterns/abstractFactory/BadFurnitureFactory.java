package com.example.generatingPatterns.abstractFactory;

import com.example.generatingPatterns.abstractFactory.furniture.chairs.BadChair;
import com.example.generatingPatterns.abstractFactory.furniture.interfaces.Chair;
import com.example.generatingPatterns.abstractFactory.furniture.interfaces.Table;
import com.example.generatingPatterns.abstractFactory.furniture.tables.BadTable;

// Конкретная фабрика (плохая мебель)
public class BadFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new BadChair();
    }

    public Table createTable() {
        return new BadTable();
    }
}
