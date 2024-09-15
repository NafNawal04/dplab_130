public class Luxury_Rides extends RideType {
    public Luxury_Rides(double distance, double costPerDistance) {
        super(distance, costPerDistance);
    }

    public double calculateFare()
    {
        return distance * costPerDistance;
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
