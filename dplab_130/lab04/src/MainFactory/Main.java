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

        double price = 0.00;
        String billingInfo = null;
        switch(choice)
        {
            case 1:
                billingInfo = beverageOptions.get(1).getBeverageDescription("");
                price += beverageOptions.get(1).cost();
                break;
            case 2:
                billingInfo = beverageOptions.get(2).getBeverageDescription("");
                price += beverageOptions.get(2).cost();
                break;
            case 3:
                System.out.println("Please order next time!");
                System.exit(0);
            default:
                System.out.println("No beverage has been selected. Give a correct option!");
                break;


        }


        System.out.println("Choose condiments you wanna add- ");
        System.out.println("1. Milk");
        System.out.println("2. White Sugar");
        System.out.println("3. Whipped Cream");
        System.out.println("4. No condiment, just plain");
        System.out.println("5. See Bill");
        
        while(true)
        {
            int choice2 = scanner.nextInt();
            switch(choice2)
            {
                case 1:
                    billingInfo += condimentOptions.get(1).getCondimentDescription("");
                    price += condimentOptions.get(1).condimentCost();
                    break;
                case 2:
                    billingInfo += condimentOptions.get(2).getCondimentDescription("");
                    price += condimentOptions.get(2).condimentCost();
                    break;
                case 3:
                    billingInfo += condimentOptions.get(3).getCondimentDescription("");
                    price += condimentOptions.get(3).condimentCost();
                    break;
                case 4:
                    billingInfo += condimentOptions.get(4).getCondimentDescription("");
                    price += condimentOptions.get(4).condimentCost();
                    break;
                case 5:
                    System.out.println(billingInfo);
                    System.out.println("Price is: " + price );
                    System.exit(0);


                default:
                    System.out.println("Invalid choice! Choose again.");
                    break;


            }



        }
        
        
        
        
        



    }
}
