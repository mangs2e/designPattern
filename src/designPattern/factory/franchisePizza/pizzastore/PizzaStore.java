package designPattern.factory.franchisePizza.pizzastore;

import designPattern.factory.franchisePizza.pizza.Pizza;
import designPattern.factory.franchisePizza.pizza.RevisePizza;

//팩토리를 참조하지 않고 각 분점에 따른 피자 생성 방법을 다르게 하기 위한 추상클래스
public abstract class PizzaStore {

    //주문 방법은 분점과 상관없이 변경되지 않도록! 좀 더 확실하게 하려면 final을 선언해줘도 됨
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type); //팩토리 객체가 아닌 PizzaStore 안의 createPizza메소드 호출
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //원재료 팩토리로 피자를 만드는 수정 주문 메소드
    public RevisePizza reviseOrderPizza(String type) {
        RevisePizza pizza;

        pizza = reviseCreatePizza(type); //팩토리 객체가 아닌 PizzaStore 안의 createPizza메소드 호출
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //각각의 서브클래스에서 create를 책임지도록 추상 메소드로 구성 - 팩토리 역할
    abstract Pizza createPizza(String type);

    abstract RevisePizza reviseCreatePizza(String item);
}
