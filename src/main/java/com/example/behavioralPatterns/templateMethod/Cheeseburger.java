package com.example.behavioralPatterns.templateMethod;

public class Cheeseburger extends BurgerTemplate {

    @Override
    protected void addProducts() {
        System.out.println("Добавлен сыр, курочка и лук");
    }
}
