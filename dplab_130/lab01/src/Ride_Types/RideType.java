package Ride_Types;

import User_Types.Driver;

public interface RideType {

    public abstract double calculateFare(double distance);
    public abstract boolean assignDriver(Driver driver);

}








