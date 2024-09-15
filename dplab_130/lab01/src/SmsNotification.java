public class SmsNotification implements NotificationService {

    public void sendNotification(String message, String recipient) {

        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}