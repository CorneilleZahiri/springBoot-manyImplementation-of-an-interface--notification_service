package com.formation_mosh.notification_service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManagerService {
    private final NotificationServiceInterface notificationService;

    public NotificationManagerService(@Qualifier("email") NotificationServiceInterface notificationService) {
        this.notificationService = notificationService;
    }

    public void send(String message){
        notificationService.send(message);
    };
}
