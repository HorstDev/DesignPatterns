package com.example.patternExamples.implementations;

import com.example.generatingPatterns.builder.Computer;
import com.example.generatingPatterns.builder.ComputerBuilder;
import com.example.generatingPatterns.builder.GamingComputerBuilder;
import com.example.patternExamples.Interfaces.PatternExample;

public class BuilderExample implements PatternExample {
    @Override
    public void runExample() {
        ComputerBuilder computerBuilder = new GamingComputerBuilder();
        Computer computer =  computerBuilder
                .setCPU("cpu1")
                .setGPU("gpu1")
                .setRAM(16)
                .build();

        System.out.println("Построенный компьютер: "
                + "\nCPU: " + computer.getCPU()
                + "\nGPU: " + computer.getGPU()
                + "\nRAM: " + computer.getRAM()
        );
    }
}
