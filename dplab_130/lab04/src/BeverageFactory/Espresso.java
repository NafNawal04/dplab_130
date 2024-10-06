package BeverageFactory;
public class Espresso implements IBeverage{
    public String getBeverageDescription(String info) {
        return info + "\nEspresso has been ordered.";
    }

    public double cost()
    {
        return 1.99;
    }
}
