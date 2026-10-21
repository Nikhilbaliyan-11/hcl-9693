package com.codewithnikhil.notificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private final NotificationService notificationService;
    @Autowired
    public Student(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendMsg(String msg) {
        notificationService.sendMsg(msg);
    }

}
