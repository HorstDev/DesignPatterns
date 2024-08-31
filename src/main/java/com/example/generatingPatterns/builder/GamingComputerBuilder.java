package com.example.generatingPatterns.builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();

    @Override
    public ComputerBuilder setCPU(String cpu) {
        computer.setCPU(cpu);
        return this;
    }

    @Override
    public ComputerBuilder setGPU(String gpu) {
        computer.setGPU(gpu);
        return this;
    }

    @Override
    public ComputerBuilder setRAM(int ram) {
        computer.setRAM(ram);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
