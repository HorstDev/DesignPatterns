package com.example.behavioralPatterns.state;

// Состояние
public abstract class State {
    protected Wallet wallet;

    public State(Wallet wallet) {
        this.wallet = wallet;
    }

    public void insertMoney() {
        System.out.println("Деньги положены в кошелек");
        wallet.setState(new HasMoneyState(wallet));
    }

    public abstract void getAllMoney();
}
