package com.example.behavioralPatterns.command;

// Получатель - объект света
public class Light {
    public void turnOn() {
        System.out.println("Свет включен");
    }

    public void turnOff() {
        System.out.println("Свет выключен");
    }
}
