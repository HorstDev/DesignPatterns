package com.example.behavioralPatterns.command;

// Конкретная команда
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) { this.light = light; }

    @Override
    public void execute() {
        light.turnOn();
    }
}
