package com.formation_mosh.notification_service;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotificationService implements NotificationServiceInterface{
    @Override
    public void send(String message) {
        System.out.println("SMS\n" + message);
    }
}
