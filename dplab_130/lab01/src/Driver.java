public class Driver {

    public int id;
    public String name;
    public String location;
    public int rating;
    public VehicleType vehicleType;
    public boolean availability;

    public Driver(int id, String name,String location, VehicleType vehicleType, boolean availability)
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = 0;
        this.vehicleType = vehicleType;
        this.availability = availability;
    }


    public void acceptRide()
    {

    }

    public void rateRider(Rider rider, int rating)
    {

    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    public void startTrip()
    {

    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
