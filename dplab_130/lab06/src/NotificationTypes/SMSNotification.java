package NotificationTypes;
public class SMSNotification implements INotify{
    public void sendNotification(String recipient, String message)
    {
         System.out.println("Recipient: "+recipient+ " has sent the message: "+message);
    }
}
