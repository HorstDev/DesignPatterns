package com.example.behavioralPatterns.chainOfResponsibility;

public class ManagerHandler extends VacationHandler {

    @Override
    public void handleRequest(int days) {
        if (days <= 5)
            System.out.println("Отпуск одобрен менеджером");
        else if (nextHandler != null)
            nextHandler.handleRequest(days);
        else
            System.out.println("Нет того, кто выше по рангу и обработал бы запрос");
    }
}
