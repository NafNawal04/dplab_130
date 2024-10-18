package Adapter;
public class LocationService {
    private String location;
    public LocationService(String _location)
    {
        this.location = _location;
    }

    public String getLocation()
    {
        return location;
    }
}
