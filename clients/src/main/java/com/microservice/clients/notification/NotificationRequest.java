package com.microservice.clients.notification;

public record NotificationRequest(
    Integer customerId,
    String customerEmail,
    String message
    ){
}
