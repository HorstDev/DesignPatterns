package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.command.*;
import com.example.patternExamples.Interfaces.PatternExample;

public class CommandExample implements PatternExample {

    @Override
    public void runExample() {
        // Объект света
        Light light = new Light();

        // Команды
        Command turnOnCommand = new LightOnCommand(light);
        Command turnOffCommand = new LightOffCommand(light);

        // Пульт управления
        RemoteControl remote = new RemoteControl();

        System.out.println("Установлена команда для включения света в пульте");
        remote.setCommand(turnOnCommand);
        remote.pressButton();

        System.out.println("Изменена команда в пульте на выключение света");
        remote.setCommand(turnOffCommand);
        remote.pressButton();
    }
}
