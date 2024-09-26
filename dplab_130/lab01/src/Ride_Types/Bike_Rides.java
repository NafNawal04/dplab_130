package Ride_Types;
import User_Types.Driver;
import Vehicle_Types.VehicleType;
public class Bike_Rides implements RideType {

    public double calculateFare(double distance)
    {
        return distance * 5;
    }
    public boolean assignDriver(Driver driver)
    {
        if(driver.getVehicleType().equals(VehicleType.Bike))
        {
            System.out.println("Bike is booked");
            return true;
        }
        else
            return false;
    }
}