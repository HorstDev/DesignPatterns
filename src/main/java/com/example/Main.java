package com.example;

import com.example.patternExamples.implementations.AbstractFactoryExample;
import com.example.patternExamples.implementations.SingletonExample;
import com.example.patternExamples.Interfaces.PatternExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PatternExample> patternExamples = new ArrayList<>();
//        patternExamples.add(new SingletonExample());
        patternExamples.add(new AbstractFactoryExample());

        for(PatternExample patternExample : patternExamples) {
            patternExample.runExample();
        }
    }
}