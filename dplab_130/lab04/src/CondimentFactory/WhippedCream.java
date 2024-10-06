package CondimentFactory;

public class WhippedCream implements ICondiment{
    public String getCondimentDescription(String info)
    {
        return info + "\nWhipped cream is added.";
    }

    public double condimentCost()
    {
        return 0.99;
    }

}
