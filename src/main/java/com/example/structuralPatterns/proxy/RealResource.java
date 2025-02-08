package com.example.structuralPatterns.proxy;

public class RealResource implements IResource {

    public void accessResource() {
        System.out.println("Произошел доступ к ресурсу");
    }
}
