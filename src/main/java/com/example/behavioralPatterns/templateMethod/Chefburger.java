package com.example.behavioralPatterns.templateMethod;

public class Chefburger extends BurgerTemplate {

    @Override
    protected void addProducts() {
        System.out.println("Добавлена говядина, капуста и соус");
    }
}
