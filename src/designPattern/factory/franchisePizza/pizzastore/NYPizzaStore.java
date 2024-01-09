package designPattern.factory.franchisePizza.pizzastore;

import designPattern.factory.franchisePizza.ingredient.factory.NYIngredientFactory;
import designPattern.factory.franchisePizza.ingredient.factory.PizzaIngredientFactory;
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

    @Override
    //분점에 원재료 공장을 전달해서 피자 생성
    RevisePizza reviseCreatePizza(String item) {
        RevisePizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Veggie Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Pepp Pizza");
        }
        return pizza;
    }
}
