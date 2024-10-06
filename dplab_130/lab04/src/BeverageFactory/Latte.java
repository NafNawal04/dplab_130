package BeverageFactory;
public class Latte implements IBeverage{
    public String getDescription() {
        return "Latte";
    }

    public double cost() {
        return 1.99;
    }
}
