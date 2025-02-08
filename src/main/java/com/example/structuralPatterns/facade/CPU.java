package com.example.structuralPatterns.facade;

// Класс подсистемы
public class CPU {

    public void freeze() {
        System.out.println("CPU: freeze");
    }

    public void execute() {
        System.out.println("CPU: execute");
    }
}
