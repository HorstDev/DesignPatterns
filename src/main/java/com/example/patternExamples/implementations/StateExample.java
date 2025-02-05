package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.state.Wallet;
import com.example.patternExamples.Interfaces.PatternExample;

public class StateExample implements PatternExample {

    @Override
    public void runExample() {
        Wallet wallet = new Wallet();

        wallet.getAllMoney();       // "Деняк нет, извлечь невозможно"
        System.out.println("Текущее состояние кошелька - " + wallet.getState().getClass().getSimpleName() + "\n");

        wallet.insertMoney();       // "Деньги положены в кошелек", ПОМЕНЯЛОСЬ СОСТОЯНИЕ НА HasMoneyState
        System.out.println("Текущее состояние кошелька - " + wallet.getState().getClass().getSimpleName() + "\n");

        wallet.getAllMoney();       // "Деньги извлечены", СНОВА ПОМЕНЯЛОСЬ СОСТОЯНИЕ НА NoMoneyState
        System.out.println("Текущее состояние кошелька - " + wallet.getState().getClass().getSimpleName() + "\n");
    }
}
