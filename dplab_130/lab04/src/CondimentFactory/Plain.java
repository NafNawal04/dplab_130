package CondimentFactory;

public class Plain implements ICondiment{
    public String getCondimentDescription(String info)
    {
        return info + "\nNo condiment is added.";
    }

    public double condimentCost()
    {
        return 0.00;
    }
}
