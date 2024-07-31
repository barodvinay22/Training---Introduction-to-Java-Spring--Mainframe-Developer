package com.hexaware.employee.controller;

import com.hexaware.notifications.api.NotificationsApi;
import com.hexaware.notifications.model.Notification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController implements NotificationsApi {
    @Override
    public ResponseEntity<Notification> getNotifiations() {
        return NotificationsApi.super.getNotifiations();
    }

    @Override
    public ResponseEntity<Notification> notificationsPost(Notification notification) {
        return NotificationsApi.super.notificationsPost(notification);
    }
}