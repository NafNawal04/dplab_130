package CondimentFactory;

import BeverageFactory.IBeverage;

public class WhiteSugar implements ICondiment{
    public IBeverage beverage;

    public WhiteSugar(IBeverage beverage)
    {
        this.beverage = beverage;
    }

    public IBeverage decorate(IBeverage beverage)
    {
        this.beverage = beverage;
        return beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return 0.30 + beverage.cost();
    }

}
