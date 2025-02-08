package com.example;

import com.example.patternExamples.implementations.*;
import com.example.patternExamples.Interfaces.PatternExample;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<PatternExample> patternExamples = Arrays.asList(
                new SingletonExample(),
                new AbstractFactoryExample(),
                new FactoryMethodExample(),
                new PrototypeExample(),
                new BuilderExample(),
                new CommandExample(),
                new StrategyExample(),
                new IteratorExample(),
                new MediatorExample(),
                new MementoExample(),
                new ObserverExample(),
                new StateExample(),
                new TemplateMethodExample(),
                new VisitorExample(),
                new AdapterExample(),
                new BridgeExample(),
                new CompositeExample(),
                new DecoratorExample()
        );

        for(int i = 0; i < patternExamples.size(); i++) {
            System.out.println(i + " - " + patternExamples.get(i).getPatternName());
        }

        while(true) {
            System.out.print("Ваш выбор паттерна: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice < 0 || choice >= patternExamples.size())
                throw new IllegalArgumentException("Ошибка. Такого выбора нет");

            patternExamples.get(choice).runExample();
        }
    }
}