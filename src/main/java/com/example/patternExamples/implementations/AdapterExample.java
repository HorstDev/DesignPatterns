package com.example.patternExamples.implementations;

import com.example.patternExamples.Interfaces.PatternExample;
import com.example.structuralPatterns.adapter.Adapter;
import com.example.structuralPatterns.adapter.ISender;

public class AdapterExample implements PatternExample {

    @Override
    public void runExample() {
        ISender sender = new Adapter();
        sender.send("bla bla");
    }
}
