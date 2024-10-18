package NotificationTypes;
public class EmailNotification implements INotify{
    public void sendNotification(String recipient, String message)
    {
        System.out.println("Recipient: "+recipient+ " has sent the message: "+message);
    }
}
