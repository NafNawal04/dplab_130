package User_Types;

import Notification_Service.NotificationService;
import Payment_Method.PaymentMethod;
import Ride_Types.RideType;

public class Rider {
    public static int nextId = 1;
    public int id;
    public String name;
    public String location;
    public int rating;
    public PaymentMethod preferredPaymentMethod;


    public Rider(String name, PaymentMethod preferredPaymentMethod)
    {
        this.id = nextId ++;
        this.name = name;
        this.location = null;
        this.rating = 0;
        this.preferredPaymentMethod =preferredPaymentMethod;
    }

    public Trip requestRide(Rider rider,RideType rideType, double distance) {
        System.out.println(name + " requested a " + rideType.getClass().getSimpleName());
        return new Trip(rider, rideType, distance);
    }


    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    public void rateDriver(Driver driver, int rating) {
        System.out.println("Rider " + name + " rated driver " + driver.getName() + " with a rating of " + rating);
        driver.updateRating(rating);
    }

    public void updateRating(int newRating) {
        this.rating = (this.rating + newRating) / 2;
        System.out.println("Rider " + name + "'s new rating is " + this.rating);
    }

    public void makePayment(double amount) {
        preferredPaymentMethod.processPayment(amount);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
