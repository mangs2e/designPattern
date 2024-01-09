package designPattern.factory.franchisePizza.ingredient.factory;

import designPattern.factory.franchisePizza.ingredient.*;

//뉴욕 분점에 맞는 원재료를 생산하는 공장
public class NYIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        //야채로 구성된 배열 리턴 (직접 하드 코딩이 아니라 다른 식으로 구현 가능)
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
