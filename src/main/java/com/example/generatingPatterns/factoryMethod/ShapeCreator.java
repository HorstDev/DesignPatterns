package com.example.generatingPatterns.factoryMethod;

import com.example.generatingPatterns.factoryMethod.shapes.Shape;

// Фабричный метод может создать только 1 тип объекта, а у абстракной фабрики идет создание множества объектов, в этом вся разница
// Т.е, например, в абстрактной фабрике у нас есть столы, стулья и т.п., и у каждой фабрики есть методы для каждого конкретного объекта,
// а в фабричном методе может быть только один объект, например, стол.

// Создатель
public interface ShapeCreator {
    Shape createShape();
}
