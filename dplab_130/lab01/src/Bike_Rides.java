public class Bike_Rides extends RideType {

    public Bike_Rides(double distance, double costPerDistance) {
        super(distance, costPerDistance);
    }

    public double calculateFare()
    {
        return distance * costPerDistance;
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