package designPattern.factory.franchisePizza;

//피자 주문 테스트용 코드
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore NY = new NYPizzaStore();
        PizzaStore Chicago = new ChicagoPizzaStore();

        Pizza Edan = NY.orderPizza("cheese");
        System.out.println(Edan.toString());
        Pizza Joel = Chicago.orderPizza("veggie");
        System.out.println(Joel.toString());

    }
}
