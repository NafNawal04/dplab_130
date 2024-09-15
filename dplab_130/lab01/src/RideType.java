public abstract class RideType {
    public double distance;
    public double costPerDistance;


    public RideType(double distance, double costPerDistance) {
        this.distance = distance;
        this.costPerDistance = costPerDistance;
    }


    public abstract double calculateFare();
    public abstract void assignDriver(Driver driver);

}
