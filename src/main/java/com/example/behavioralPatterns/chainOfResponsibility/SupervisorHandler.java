package com.example.behavioralPatterns.chainOfResponsibility;

public class SupervisorHandler extends VacationHandler {

    // Руководитель может выдавать отпуск не более 2-х дней, если запрос более 2-х дней, то он передается руководству выше
    @Override
    public void handleRequest(int days) {
        if (days <= 2)
            System.out.println("Отпуск одобрен руководителем");
        else if (nextHandler != null)
            nextHandler.handleRequest(days);
        else
            System.out.println("Нет того, кто выше по рангу и обработал бы запрос");
    }
}
