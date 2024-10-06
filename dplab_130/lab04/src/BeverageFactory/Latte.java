package BeverageFactory;
public class Latte implements IBeverage{
    public String getBeverageDescription(String info) {
        return info + "\nLatte has been ordered.";
    }

    public double cost() {
        return 2.99;
    }
}
