package BeverageFactory;
public class Espresso implements IBeverage{
    public String getDescription() {
        return "Espresso";
    }

    public double cost()
    {
        return 1.99;
    }
}
