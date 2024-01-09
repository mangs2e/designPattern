package designPattern.factory.franchisePizza;

import designPattern.factory.franchisePizza.pizza.Pizza;
import designPattern.factory.franchisePizza.pizza.RevisePizza;
import designPattern.factory.franchisePizza.pizzastore.ChicagoPizzaStore;
import designPattern.factory.franchisePizza.pizzastore.NYPizzaStore;
import designPattern.factory.franchisePizza.pizzastore.PizzaStore;

//피자 주문 테스트용 코드
public class PizzaTestDrive {
    public static void main(String[] args) {
        //팩토리 메소드 패턴 주문
        PizzaStore NY = new NYPizzaStore();
        PizzaStore Chicago = new ChicagoPizzaStore();

        System.out.println("팩토리 메소드 패턴");
        Pizza Edan = NY.orderPizza("cheese");
        System.out.println(Edan.toString());
        Pizza Joel = Chicago.orderPizza("veggie");
        System.out.println(Joel.toString());

        System.out.println("***************************");
        //추상 팩토리 패턴 주문
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chPizzaStore = new ChicagoPizzaStore();

        System.out.println("추상 팩토리 패턴");
        RevisePizza Edan2 = nyPizzaStore.reviseOrderPizza("cheese");
        System.out.println(Edan2.toString());
        RevisePizza Joel2 = chPizzaStore.reviseOrderPizza("cheese");
        System.out.println(Joel2.toString());
    }
}
