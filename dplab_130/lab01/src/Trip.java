public class Trip {
    public int id=0;
    public Rider rider;
    public Driver driver;
    public String pickupLocation;
    public String dropOffLocation;
    public RideType rideType;
    public double fare;
    public double distance;

    public String status;
    public NotificationService notificationService;


    public Trip(Rider rider, RideType rideType, String pickupLocation, String dropOffLocation, double distance, NotificationService notificationService) {
        this.id = this.id +1;
        this.rider = rider;
        this.rideType = rideType;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.distance = distance;
        this.notificationService = notificationService;
        this.fare = rideType.calculateFare();
    }


    public void assignDriver(Driver driver) {
        if (rideType.assignDriver(driver)) {
            this.driver = driver;
            this.status = "Driver assigned";
            notificationService.sendNotification("Your driver has been assigned.");
            notificationService.sendNotification("You have been assigned a trip.");
        } else {
            this.status = "No suitable driver found";
            notificationService.sendNotification("No drivers available for your ride.");
        }
    }



    public void startTrip() {
        this.status = "STARTED";
        notificationService.sendNotification("Trip started");
        System.out.println("Trip from " + pickupLocation + " to " + dropOffLocation + " has started.");
    }



    public void completeTrip() {
        this.status = "Completed";
        rider.makePayment(fare);
        notificationService.sendNotification("Your trip is completed.");
        notificationService.sendNotification("Trip completed successfully.");
    }



    public double getFare() {
        return fare;
    }

    public double getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

}
