package designPattern.factory.franchisePizza.pizza;

import designPattern.factory.franchisePizza.ingredient.factory.PizzaIngredientFactory;

//이제 더이상 NYCheesePizza / ChicagoCheesePizza처럼 분점별로 클래스를 나눌 필요가 없음!
//원재료 팩토리에서 원재료들을 관리하므로
public class CheesePizza extends RevisePizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
