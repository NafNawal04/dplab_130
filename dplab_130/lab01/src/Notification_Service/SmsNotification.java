package Notification_Service;
public class SmsNotification implements NotificationService {

    public void sendNotification(String message) {

        System.out.println("Sending SMS: " + message);
    }
}