package CondimentFactory;

public class Milk implements ICondiment{
    public String getCondimentDescription(String info)
    {
        return info + "\nMilk is added.";
    }

    public double condimentCost()
    {
        return 0.99;
    }
}
