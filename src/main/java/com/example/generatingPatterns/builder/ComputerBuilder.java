package com.example.generatingPatterns.builder;

// Паттерн строитель нужен для построения сложных объектов.

// Есть продукт, который строим
// Есть строитель (интерфейс), определяющий методы построения
// Есть конкретный строитель
// Есть директор, который отвечает за использование строителя (часто он необязателен)

// Использование конструктора часто может быть неподходящим, т.к. объект может быть огромным.
// Для этого и используется паттерн builder

// Здесь приведена реализация fluent builder
public interface ComputerBuilder {
    ComputerBuilder setCPU(String cpu);
    ComputerBuilder setGPU(String gpu);
    ComputerBuilder setRAM(int ram);
    Computer build();
}
