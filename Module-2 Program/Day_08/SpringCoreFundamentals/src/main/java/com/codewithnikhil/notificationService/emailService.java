package com.codewithnikhil.notificationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class emailService implements NotificationService {
    public void sendMsg(String msg) {
        System.out.println( msg + " via EmailService" );
    }

}
