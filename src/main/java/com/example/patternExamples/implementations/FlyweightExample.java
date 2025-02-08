package com.example.patternExamples.implementations;

import com.example.patternExamples.Interfaces.PatternExample;
import com.example.structuralPatterns.flyweight.CharacterLightweightFactory;
import com.example.structuralPatterns.flyweight.DifficultCharacter;
import com.example.structuralPatterns.flyweight.ICharacter;

import java.util.ArrayList;
import java.util.List;

public class FlyweightExample implements PatternExample {

    @Override
    public void runExample() {
        var lightweightFactory = new CharacterLightweightFactory();
        List<ICharacter> flyweightCharacters = new ArrayList<>();

        // В итоге в фабрике легковесов создается всего два символа и по 1000 ссылок на символ, что сильно экономит память
        for (int i = 0; i < 1000; i++) {
            flyweightCharacters.add(lightweightFactory.getCharacter('А', 12, "Times New Roman", "Red"));
            flyweightCharacters.add(lightweightFactory.getCharacter('В', 14, "Times New Roman", "Blue"));
        }

        List<ICharacter> flyweightCharacters2 = new ArrayList<>();

        // А вот тут создается по 1000 одних и тех же объектов, что небрежно для памяти
        for (int i = 0; i < 1000; i++)
        {
            flyweightCharacters2.add(new DifficultCharacter('А', 12, "Times New Roman", "Red"));
            flyweightCharacters2.add(new DifficultCharacter('В', 14, "Times New Roman", "Blue"));
        }
    }
}
