package com.example.generatingPatterns.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person implements PersonPrototype {
    private String name;
    private int age;

    @Override
    public PersonPrototype clone() {
        Person person = new Person();
        person.age = this.age;
        person.name = this.name;
        return person;
    }
}
