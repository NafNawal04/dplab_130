package CondimentFactory;
import BeverageFactory.IBeverage;

public interface ICondiment {
    IBeverage decorate(IBeverage beverage);
}
