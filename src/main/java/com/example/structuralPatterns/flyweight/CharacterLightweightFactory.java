package com.example.structuralPatterns.flyweight;

import java.util.HashMap;

// Легковесная фабрика
public class CharacterLightweightFactory {

    private final HashMap<Character, ICharacter> characterCache = new HashMap<>();

    public ICharacter getCharacter(char symbol, int fontSize, String fontFamily, String color) {

        if (!characterCache.containsKey(symbol)) {
            var character = new DifficultCharacter(symbol, fontSize, fontFamily, color);
            characterCache.put(symbol, character);
        }

        return characterCache.get(symbol);
    }
}
