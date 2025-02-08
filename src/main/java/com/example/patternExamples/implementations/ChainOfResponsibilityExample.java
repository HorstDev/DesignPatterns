package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.chainOfResponsibility.DirectorHandler;
import com.example.behavioralPatterns.chainOfResponsibility.ManagerHandler;
import com.example.behavioralPatterns.chainOfResponsibility.SupervisorHandler;
import com.example.behavioralPatterns.chainOfResponsibility.VacationHandler;
import com.example.patternExamples.Interfaces.PatternExample;

public class ChainOfResponsibilityExample implements PatternExample {

    // Здесь передается запрос руководителю.
    // Если руководитель не может обработать, передается менеджеру
    // Если менеджер не может обработать, передается директору
    @Override
    public void runExample() {
        VacationHandler supervisor = new SupervisorHandler();
        VacationHandler manager = new ManagerHandler();
        VacationHandler director = new DirectorHandler();

        // Устанавливаем для supervisor следующего обработчика: manager.
        // Т.е. если supervisor не обработает запрос, он будет передан менеджеру
        supervisor.setNextHandler(manager);
        manager.setNextHandler(director);

        supervisor.handleRequest(2);        // Вывод: Отпуск одобрен руководителем
        supervisor.handleRequest(5);        // Вывод: Отпуск одобрен менеджером
        supervisor.handleRequest(10);       // Вывод: Отпуск одобрен директором
    }
}
