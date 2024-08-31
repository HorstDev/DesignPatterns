package com.example.patternExamples.implementations;

import com.example.generatingPatterns.prototype.Person;
import com.example.generatingPatterns.prototype.PersonPrototype;
import com.example.patternExamples.Interfaces.PatternExample;

public class PrototypeExample implements PatternExample {

    @Override
    public void runExample() {
        Person person = new Person();
        person.setName("Олег");
        person.setAge(22);
        System.out.println("Hash code: " + person.hashCode());

        PersonPrototype person2 = person.clone();
        System.out.println("Hash code клонированного объекта: " + person2.hashCode());
    }
}
