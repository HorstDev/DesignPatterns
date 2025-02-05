package com.example.structuralPatterns.adapter;

// Нужно, чтобы Requester реализовывал ISender. Т.к. названия методов отличаются, а менять их нельзя, используем адаптер
public class Adapter implements ISender {

    private final Requester requester = new Requester();

    public void send(String message) {
        requester.sendRequest(message);
    }
}
