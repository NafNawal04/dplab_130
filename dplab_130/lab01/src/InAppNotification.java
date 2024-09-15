public class InAppNotification implements NotificationService {

    public void sendNotification(String message, String recipient) {

        System.out.println("Sending In-App Notification to " + recipient + ": " + message);
    }
}