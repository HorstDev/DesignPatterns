package com.example.behavioralPatterns.state;

// Контекст
public class Wallet {
    protected State currentState;

    public Wallet() {
        currentState = new NoMoneyState(this);
    }

    public void getAllMoney() {
        currentState.getAllMoney();
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getState() {
        return currentState;
    }
}
