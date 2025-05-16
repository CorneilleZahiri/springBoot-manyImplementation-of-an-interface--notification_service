package com.formation_mosh.notification_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(NotificationServiceApplication.class, args);

		NotificationManagerService notificationManagerService =  applicationContext.getBean(NotificationManagerService.class);
		notificationManagerService.send("le qualify");

		//NotificationManagerService notificationManagerService = new NotificationManagerService(new EmailNotificationService());
		//notificationManagerService.send("my email");

	}

}
