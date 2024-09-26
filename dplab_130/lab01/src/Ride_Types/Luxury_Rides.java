package Ride_Types;


public class Luxury_Rides implements RideType {

    public double calculateFare(double distance)
    {
        return distance * 7;
    }

}
