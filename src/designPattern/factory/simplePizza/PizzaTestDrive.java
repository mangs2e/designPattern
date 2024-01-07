package designPattern.factory.simplePizza;

//피자 주문 테스트용 클래스
public class PizzaTestDrive {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza.toString());

        Pizza pizza2 = store.orderPizza("veggie");
        System.out.println(pizza.toString());

    }

}
