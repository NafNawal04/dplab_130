package Notification_Service;
public class InAppNotification implements NotificationService {

    public void sendNotification(String message) {

        System.out.println("Sending In-App Notification : " + message);
    }
}