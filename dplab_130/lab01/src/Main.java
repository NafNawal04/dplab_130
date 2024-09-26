import java.util.Scanner;
import User_Types.*;
import Ride_Types.*;
import Payment_Method.*;
import Notification_Service.*;
import Vehicle_Types.*;


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Ride Sharing App");
        int choice;


        do {

            System.out.println("1. Rider");
            System.out.println("2. Driver");
            System.out.println("3. Admin");
            System.out.println("4. Exit");
            System.out.print("Press the number for the desired operation: ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    createRider(scanner);
                    break;
                case 2:
                    createDriver(scanner);
                    break;
                case 3:
                    createAdmin(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the app.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice !=4);


    }




    public static void createRider(Scanner scanner)
    {

        System.out.println("Enter Rider Name:");
        String riderName = scanner.nextLine();

        System.out.println("1. Credit Card");
        System.out.println("2. Paypal");
        System.out.println("3. Digital Wallet");
        int paymentChoice = scanner.nextInt();
        PaymentMethod paymentMethod;
        if (paymentChoice == 1) {
            System.out.println("Enter Card Number:");
            int cardNumber = scanner.nextInt();

            System.out.println("Enter Card Holder Name:");
            String cardHolderName = scanner.nextLine();

            paymentMethod = new Credit_Card(cardNumber,cardHolderName);
        }
        else if (paymentChoice == 2)
        {
            System.out.println("Enter OTP:");
            int otp = scanner.nextInt();

            System.out.println("Enter Card Holder Name:");
            String accHolderName = scanner.nextLine();
            paymentMethod = new Paypal(otp,accHolderName);
        } else
        {
            System.out.println("Enter Wallet Holder Name:");
            String walletHolderName = scanner.nextLine();
            paymentMethod = new Digital_Wallet(walletHolderName);
        }


        Rider rider = new Rider(riderName, paymentMethod);
        System.out.println("Rider created successfully with ID: " + rider.getId());

        System.out.println("Enter Pickup Location:");
        String pickupLocation = scanner.nextLine();

        System.out.println("Enter Drop-Off Location:");
        String dropOffLocation = scanner.nextLine();

        System.out.println("Enter Distance (in kilometers):");
        double distance = scanner.nextDouble();


        System.out.println("1. SMS");
        System.out.println("2. In App Notification");
        int nChoice = scanner.nextInt();

        NotificationService notificationService;

        if (nChoice == 1) {
            notificationService = new SmsNotification();
        }
        else
        {
            notificationService = new InAppNotification();
        }


        RideType selectedRideType = chooseRideType(scanner, distance);

        Trip trip = rider.requestRide(selectedRideType, pickupLocation, dropOffLocation, distance, notificationService);
        System.out.println("Fare for the ride: " + trip.getFare());




    }


    public static RideType chooseRideType(Scanner scanner, double distance)
    {

        System.out.println("Select Ride Type:");
        System.out.println("1. Carpool");
        System.out.println("2. Luxury Ride");
        System.out.println("3. Bike Ride");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

            case 2:

            case 3:

            default:
                System.out.println("Invalid choice. Defaulting to Carpool.");

        }


        return null;
    }
    public static void createDriver(Scanner scanner)
    {

    }

    public static void createAdmin(Scanner scanner)
    {

    }
}
