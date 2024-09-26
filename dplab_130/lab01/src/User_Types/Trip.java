package User_Types;

import Notification_Service.NotificationService;
import Ride_Types.RideType;


@SuppressWarnings("unused")

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


    public Trip(Rider rider, RideType rideType, double distance)
    {
        this.id = this.id +1;
        this.rider = rider;
        this.rideType = rideType;
        this.pickupLocation = rider.location;
        this.distance = distance;
    }


    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
        System.out.println("DropOff location set to: " + this.dropOffLocation);
    }

    public void assignDriver(Driver[] drivers) {
        for (Driver driver : drivers)
        {
            if (driver.location.equals(this.dropOffLocation) && driver.availability)
            {
                this.driver = driver;
                this.status = "Driver assigned";
                driver.availability = false;
                notificationService.sendNotification("Your driver " + driver.getName() + " has been assigned.");
                return;
            }
        }

            this.status = "No suitable driver found";
            notificationService.sendNotification("No drivers available for your ride.");

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
