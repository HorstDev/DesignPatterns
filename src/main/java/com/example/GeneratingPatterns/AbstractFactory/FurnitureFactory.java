package com.example.GeneratingPatterns.AbstractFactory;

import com.example.GeneratingPatterns.AbstractFactory.furniture.interfaces.Chair;
import com.example.GeneratingPatterns.AbstractFactory.furniture.interfaces.Table;

//* Плюсы использования абстракной фабрики:
//* 1) Отделение создания объектов от клиентского кода: клиентский код не зависит от классов мебели и абстрагируется от создания объектов
//* 2) Соблюдается принцип открытости-закрытости: добавление новых стилей мебели (конкретных продуктов) или фабрик (конкретных фабрик) не требует изменения клиентского кода
//* 3) Гибкость и расширяемость: возможность добавления новых видов мебели и фабрик без изменения существующего кода

// Абстрактная фабрика
public interface FurnitureFactory {
    public Chair createChair();
    public Table createTable();
}
