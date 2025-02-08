package com.example.patternExamples.implementations;

import com.example.patternExamples.Interfaces.PatternExample;
import com.example.structuralPatterns.facade.ComputerFacade;

public class FacadeExample implements PatternExample {

    @Override
    public void runExample() {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
