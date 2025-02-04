package com.example.behavioralPatterns.mediator;

import lombok.Getter;

// Конкретный участник
public class ChatUser implements IUser {

    private final IChatMediator mediator;

    @Getter
    private final String name;

    public ChatUser(IChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Я (" + name + ") получил сообщение: " + message);
    }
}
