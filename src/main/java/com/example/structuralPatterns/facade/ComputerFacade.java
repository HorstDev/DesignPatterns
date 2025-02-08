package com.example.structuralPatterns.facade;

// Фасад
public class ComputerFacade {

    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load();
        hardDrive.read();
        cpu.execute();
    }
}
