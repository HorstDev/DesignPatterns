package com.example.behavioralPatterns.state;

// Конкретное состояние
public class NoMoneyState extends State {
    public NoMoneyState(Wallet wallet) {
        super(wallet);
    }

    @Override
    public void getAllMoney() {
        System.out.println("Деняк нет, извлечь невозможно");
    }
}
