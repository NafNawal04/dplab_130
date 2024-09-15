public class Driver {

    public int id;
    public String name;
    public String location;
    public int rating;
    public VehicleType vehicleType;
    public boolean availability;

    public Driver(int id, String name,String location,int rating, VehicleType vehicleType, boolean availability)
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.vehicleType = vehicleType;
        this.availability = availability;
    }


    public void acceptRide(Trip trip) {
        if (availability) {
            System.out.println(name + " has accepted the trip.");
            trip.assignDriver(this);
            this.availability = false;
        } else {
            System.out.println(name + " is not available.");
        }
    }

    public void rateRider(Rider rider, int rating)
    {
        System.out.println("Driver " + name + " rated rider " + rider.getName() + " with a rating of " + rating);
        rider.updateRating(rating);
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    public void startTrip(Trip trip) {
        System.out.println("Driver " + name + " has started the trip.");
        trip.startTrip();
    }



    public void updateRating(int newRating) {
        this.rating = (this.rating + newRating) / 2;
        System.out.println("Driver " + name + "'s new rating is " + this.rating);
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }


}
