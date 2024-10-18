import NotificationTypes.*;
import Adapter.*;

public class NotificationService {
    public static void main(String[] args)
    {
        INotify sms = new SMSNotification();
        sms.sendNotification("Nafisa","I have sent an SMS.");

        INotify email = new EmailNotification();
        email.sendNotification("Nawal","I have sent an Email.");

        INotify ePost = new EPostalAdapter(new EPostalNotification(),new LocationService("Dhaka"));
        ePost.sendNotification("Nafisa","I have sent an E-Postal.");

    }

}
