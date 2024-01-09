package designPattern.factory.franchisePizza.ingredient.factory;

import designPattern.factory.franchisePizza.ingredient.*;

//모든 원재료를 생산할 팩토리를 위한 인터페이스
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
