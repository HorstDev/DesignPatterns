package com.example.behavioralPatterns.state;

// Конкретное состояние
public class HasMoneyState extends State {
    public HasMoneyState(Wallet wallet) {
        super(wallet);
    }

    @Override
    public void getAllMoney() {
        System.out.println("Деньги извлечены");
        wallet.setState(new NoMoneyState(wallet));
    }

}
