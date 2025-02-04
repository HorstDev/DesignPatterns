package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.mediator.ChatMediator;
import com.example.behavioralPatterns.mediator.ChatUser;
import com.example.behavioralPatterns.mediator.IUser;
import com.example.patternExamples.Interfaces.PatternExample;

public class MediatorExample implements PatternExample {

    @Override
    public void runExample() {
        ChatMediator mediator = new ChatMediator();

        ChatUser user1 = new ChatUser(mediator, "Вася");
        ChatUser user2 = new ChatUser(mediator, "Петя");
        ChatUser user3 = new ChatUser(mediator, "Пуп");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        System.out.println(user1.getName() + " отправляет всем сообщение через посредника...");
        user1.sendMessage("Привет, земляне!");

        System.out.println("\n" + user2.getName() + " отправляет всем сообщение через посредника...");
        user2.sendMessage("Всем здравствуйте!");
    }
}
