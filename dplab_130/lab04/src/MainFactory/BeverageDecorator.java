package MainFactory;
import BeverageFactory.*;
import CondimentFactory.*;

import java.util.HashMap;
import java.util.Map;

public class BeverageDecorator {

    public static Map<Integer, IBeverage> chooseBeverageType() {
        Map<Integer, IBeverage> beverageOptions = new HashMap<>();
        beverageOptions.put(1, new Espresso());
        beverageOptions.put(2, new Latte());

        return beverageOptions;
    }

    public static Map<Integer, ICondiment> chooseCondimentType() {
        Map<Integer, ICondiment> condimentOptions = new HashMap<>();
        condimentOptions.put(1, new Milk());
        condimentOptions.put(2, new WhiteSugar());
        condimentOptions.put(3, new WhippedCream());
        condimentOptions.put(4, new Plain());

        return condimentOptions;
    }
}
