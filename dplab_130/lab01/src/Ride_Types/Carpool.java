package Ride_Types;
import User_Types.Driver;
import Vehicle_Types.VehicleType;
public class Carpool implements RideType {
    public double calculateFare(double distance)
    {
        return distance;
    }
    public boolean assignDriver(Driver driver)
    {
        if(driver.getVehicleType().equals(VehicleType.Car))
        {
            System.out.println("Car is booked");
            return true;
        }
        else
            return false;
    }
}
