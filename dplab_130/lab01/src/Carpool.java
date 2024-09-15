public class Carpool extends RideType {
    public Carpool(double distance, double costPerDistance) {
        super(distance, costPerDistance);
    }

    public double calculateFare()
    {
        return distance * costPerDistance;
    }
    public void assignDriver(Driver driver)
    {
        if(driver.getVehicleType().equals(VehicleType.Car))
        {
            System.out.println("Car is booked");
        }
    }
}
