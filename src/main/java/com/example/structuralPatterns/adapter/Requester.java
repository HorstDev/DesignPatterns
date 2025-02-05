package com.example.structuralPatterns.adapter;

// Менять нельзя
public class Requester {

    public void sendRequest(String message) {
        // логика
        System.out.println("Отправлено от Requester: " + message);
    }
}
