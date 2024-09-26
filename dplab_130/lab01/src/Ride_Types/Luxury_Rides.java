package Ride_Types;

import User_Types.Driver;
import Vehicle_Types.VehicleType;


public class Luxury_Rides implements RideType {

    public double calculateFare(double distance)
    {
        return distance * 7;
    }
    public boolean assignDriver(Driver driver)
    {
        if(driver.getVehicleType().equals(VehicleType.Luxury))
        {
            System.out.println("Luxury Car is booked");
            return true;
        }
        else
            return false;
    }
}
