public class Driver {

    public String id;
    public String name;
    public String location;
    public int rating;
    public VehicleType vehicleType;
    public boolean availability;

    public Driver(String id, String name, VehicleType vehicleType, boolean availability)
    {
        this.id = id;
        this.name = name;
        this.location = null;
        this.rating = 0;
        this.vehicleType = vehicleType;
        this.availability = availability;
    }


    public void acceptRide()
    {

    }

    public void rateRider()
    {

    }

    public void updateLocation()
    {

    }

    public void startTrip()
    {

    }
}
