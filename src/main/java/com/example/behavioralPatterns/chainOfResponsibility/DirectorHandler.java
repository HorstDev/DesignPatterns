package com.example.behavioralPatterns.chainOfResponsibility;

public class DirectorHandler extends VacationHandler {

    @Override
    public void handleRequest(int days) {
        if (days <= 10)
            System.out.println("Отпуск одобрен директором");
        else if (nextHandler != null)
            nextHandler.handleRequest(days);
        else
            System.out.println("Нет того, кто выше по рангу и обработал бы запрос");
    }
}
