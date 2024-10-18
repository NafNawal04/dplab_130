package Adapter;
import NotificationTypes.INotify;
public class EPostalAdapter implements INotify{

    public EPostalNotification ePostal;
    public LocationService locationService;
    public EPostalAdapter(EPostalNotification _ePostal, LocationService _location)
    {
        this.ePostal = _ePostal;
        this.locationService = _location;
    }

    public void sendNotification(String recipient, String message)
    {
        String location = locationService.getLocation();
        ePostal.sendPostalNotification(recipient,message,location);

    }
}
