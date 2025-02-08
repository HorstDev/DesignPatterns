package com.example.patternExamples.implementations;

import com.example.patternExamples.Interfaces.PatternExample;
import com.example.structuralPatterns.proxy.IResource;
import com.example.structuralPatterns.proxy.Proxy;

public class ProxyExample implements PatternExample {

    @Override
    public void runExample() {
        IResource proxy = new Proxy("secretKey123");
        System.out.println("Запрашиваем доступ к ресурсу с пройденной проверкой");
        proxy.accessResource();

        IResource proxy2 = new Proxy("invalidKey");
        System.out.println("Запрашиваем доступ к ресурсу с НЕпройденной проверкой");
        proxy2.accessResource();
    }
}
