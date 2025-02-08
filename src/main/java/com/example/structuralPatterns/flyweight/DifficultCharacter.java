package com.example.structuralPatterns.flyweight;

// Конкретный легковес
public class DifficultCharacter implements ICharacter {

    private final char symbol;
    private final int fontSize;
    private final String fontFamily;
    private final String color;

    public DifficultCharacter(char symbol, int fontSize, String fontFamily, String color) {
        this.symbol = symbol;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("symbol = " + symbol + ", size = " + fontSize + ", family = " + fontFamily + ", color = " + color);
    }
}
