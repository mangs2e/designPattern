package designPattern.factory.franchisePizza.pizzastore;

import designPattern.factory.franchisePizza.ingredient.factory.ChicagoIngredientFactory;
import designPattern.factory.franchisePizza.ingredient.factory.PizzaIngredientFactory;
import designPattern.factory.franchisePizza.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoni();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }

    @Override
    //분점에 원재료 공장을 전달해서 피자 생성
    RevisePizza reviseCreatePizza(String item) {
        RevisePizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("CH Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("CH Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("CH Veggie Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("CH Pepp Pizza");
        }
        return pizza;
    }
}
