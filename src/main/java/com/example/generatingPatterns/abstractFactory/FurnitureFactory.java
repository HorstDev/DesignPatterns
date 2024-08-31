package com.example.generatingPatterns.abstractFactory;

import com.example.generatingPatterns.abstractFactory.furniture.interfaces.Chair;
import com.example.generatingPatterns.abstractFactory.furniture.interfaces.Table;

//* Плюсы использования абстракной фабрики:
//* 1) Отделение создания объектов от клиентского кода: клиентский код не зависит от классов мебели и абстрагируется от создания объектов
//* 2) Соблюдается принцип открытости-закрытости: добавление новых стилей мебели (конкретных продуктов) или фабрик (конкретных фабрик) не требует изменения клиентского кода
//* 3) Гибкость и расширяемость: возможность добавления новых видов мебели и фабрик без изменения существующего кода

// Абстрактная фабрика
public interface FurnitureFactory {
    public Chair createChair();
    public Table createTable();
}
