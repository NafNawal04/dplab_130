package MainFactory;
import BeverageFactory.*;
import CondimentFactory.*;

import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {

        Map<Integer, IBeverage> beverageOptions = BeverageDecorator.chooseBeverageType();
        Map<Integer, ICondiment> condimentOptions = BeverageDecorator.chooseCondimentType();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Choose a beverage");
        System.out.println("1.Espresso");
        System.out.println("2.Latte");
        System.out.println("3.Exit");
        System.out.println("Press the desired option: ");
        int choice = scanner.nextInt();


        if (choice == 3) {
            System.out.println("Please order next time!");
            System.exit(0);
        }

        if (!beverageOptions.containsKey(choice)) {
            System.out.println("No beverage has been selected. Give a correct option!");
            System.out.println("Press the desired option: ");
            choice = scanner.nextInt();
        }

        String billingInfo = beverageOptions.get(choice).getBeverageDescription("");
        double price = beverageOptions.get(choice).cost();


        System.out.println("Choose condiments you wanna add- ");
        System.out.println("1. Milk");
        System.out.println("2. White Sugar");
        System.out.println("3. Whipped Cream");
        System.out.println("4. No condiment, just plain");
        System.out.println("5. See Bill");
        
        while(true)
        {
            int choice2 = scanner.nextInt();


            if (choice2 == 5) {
                System.out.println(billingInfo);
                System.out.println("Price is: " + price);
                System.exit(0);
            }

            if (!condimentOptions.containsKey(choice2)) {
                System.out.println("Invalid choice! Choose again.");
                continue;
            }

            billingInfo += condimentOptions.get(choice2).getCondimentDescription("");
            price += condimentOptions.get(choice2).condimentCost();


        }
        


    }
}
