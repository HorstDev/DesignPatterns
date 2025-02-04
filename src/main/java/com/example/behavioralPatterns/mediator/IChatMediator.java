package com.example.behavioralPatterns.mediator;

// Посредник
public interface IChatMediator {
    void sendMessage(String message, IUser user);
}
