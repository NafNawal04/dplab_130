package Ride_Types;

public class Bike_Rides implements RideType {

    public double calculateFare(double distance)
    {
        return distance * 5;
    }

}