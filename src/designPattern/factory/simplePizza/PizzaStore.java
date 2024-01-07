package designPattern.factory.simplePizza;

//팩토리를 사용하는 클라이언트
public class PizzaStore {
    SimpleFactory factory; //SimpleFactory에 대한 레퍼런스 저장

    public PizzaStore(SimpleFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type); //new 연산자 대신 팩토리 메소드를 호출해서 객체 생성 -> 주문 받은 객체를 전달하기만 하면 됨!
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
