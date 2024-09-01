package com.example.behavioralPatterns.command;

import lombok.Setter;

// Исполнитель (пульт управления)
@Setter
public class RemoteControl {
    private Command command;

    public void pressButton() {
        command.execute();
    }
}
