package com.example.behavioralPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

// Конкретный посредник
public class ChatMediator implements IChatMediator {

    private List<IUser> users = new ArrayList<IUser>();

    public void addUser(IUser user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, IUser userSender) {
        for (IUser u : users) {
            if (!u.equals(userSender)) {
                u.receiveMessage(message);
            }
        }
    }
}
