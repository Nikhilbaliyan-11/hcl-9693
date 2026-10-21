package com.codewithnikhil.notificationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class whatsupService implements NotificationService {

    @Override
    public void sendMsg(String msg) {
        System.out.println(msg +   " via whatsupService");
    }
}
