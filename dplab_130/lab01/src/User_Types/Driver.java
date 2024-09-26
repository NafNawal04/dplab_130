package User_Types;

import Vehicle_Types.VehicleType;

@SuppressWarnings("unused")
public class Driver {

    public static int nextId = 1;
    public int id;
    public String name;
    public String location;
    public int rating;
    public VehicleType vehicleType;
    public boolean availability;

    public Driver(String name, VehicleType vehicleType, boolean availability)
    {
        this.id = nextId++;
        this.name = name;
        this.location = null;
        this.rating = 0;
        this.vehicleType = vehicleType;
        this.availability = availability;
    }


    public void acceptRide(Trip trip) {
        if (availability && trip.dropOffLocation != null) {
            System.out.println(name + " has accepted the trip.");
            trip.assignDriver(new Driver[]{this});
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
