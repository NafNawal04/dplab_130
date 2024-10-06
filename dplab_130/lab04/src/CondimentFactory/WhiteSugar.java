package CondimentFactory;
public class WhiteSugar implements ICondiment{
    public String getCondimentDescription(String info)
    {
        return info + "\nWhite Sugar is added.";
    }

    public double condimentCost()
    {
        return 0.99;
    }
}
