package com.formation_mosh.notification_service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationServiceInterface{

    @Override
    public void send(String message) {
        System.out.println("EMAIL\n"+ message);
    }
}
