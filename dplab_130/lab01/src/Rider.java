public class Rider {
    public int id;
    public String name;
    public String location;
    public int rating;
    public PaymentMethod preferredPaymentMethod;


    public Rider(int id, String name, PaymentMethod preferredPaymentMethod)
    {
        this.id = id;
        this.name = name;
        this.location = null;
        this.rating = 0;
        this.preferredPaymentMethod =preferredPaymentMethod;
    }

    public Trip requestRide(RideType rideType, String pickupLocation, String dropOffLocation, double distance, NotificationService notificationService) {
        System.out.println(name + " requested a " + rideType.getClass().getSimpleName()
                + " ride from " + pickupLocation + " to " + dropOffLocation);
        return new Trip(this, rideType, pickupLocation, dropOffLocation, distance, notificationService);
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
