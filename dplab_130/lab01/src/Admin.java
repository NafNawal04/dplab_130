import java.util.List;

public class Admin {
    public String id;
    public String name;
    public String role;

    public Admin(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }


    public void manageDriver(Driver driver) {

        System.out.println("Managing driver: " + driver.getName());
    }


    public void manageRider(Rider rider) {

        System.out.println("Managing rider: " + rider.getName());
    }


    public void viewTripHistory(List<Trip> trips) {

        for (Trip trip : trips) {
            System.out.println("Trip ID: " + trip.getId() + ", Status: " + trip.getStatus() + ", Fare: " + trip.getFare());
        }
    }

    public void handleDispute(Driver driver, Rider rider, String disputeDetails) {
        System.out.println("Handling dispute between Driver " + driver.getName() + " and Rider " + rider.getName());
        System.out.println("Dispute details: " + disputeDetails);

    }
}
