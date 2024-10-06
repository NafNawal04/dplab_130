package MainFactory;
import CondimentFactory.*;
import BeverageFactory.*;

import java.util.HashMap;

public class MappingFactory {

    private static final HashMap<Integer, ICondiment> condimentOptions = new HashMap<>();

    static
    {
        condimentOptions.put(1,new Milk(null));
        condimentOptions.put(2,new WhippedCream(null));
        condimentOptions.put(3,new WhiteSugar(null));
    }

    public static IBeverage selectCondiment(int choice, IBeverage beverage)
    {
        ICondiment selectedCondiment = condimentOptions.get(choice);
        return selectedCondiment.decorate(beverage);
    }
}
