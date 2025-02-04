package com.example.behavioralPatterns.mediator;

// Участник
public interface IUser {
    // Отправка сообщения
    void sendMessage(String message);

    // Доставка сообщения
    void receiveMessage(String message);
}
