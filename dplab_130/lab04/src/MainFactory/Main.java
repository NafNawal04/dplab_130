package MainFactory;

import BeverageFactory.IBeverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Choose a beverage");
        System.out.println("1.Espresso");
        System.out.println("2.Latte");
        System.out.println("Press the desired option: ");
        int choice = scanner.nextInt();



    }
}
