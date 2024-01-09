package designPattern.factory.franchisePizza.pizzastore;

import designPattern.factory.franchisePizza.pizza.*;

public class NYPizzaStore extends PizzaStore {
    //피자를 만드는 과정은 분점Store에서 직접 구현
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoni();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
