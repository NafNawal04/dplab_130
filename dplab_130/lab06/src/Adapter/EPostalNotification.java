package Adapter;
public class EPostalNotification{
    void sendPostalNotification(String recipient, String message, String location)
    {
        System.out.println("Recipient: "+recipient+ " has sent the message: "+message+ " from "+ location);
    }

}
