package designPattern.factory.simplePizza;

//피자 팩토리 (피자를 만들기 위한 객체 생성 부분을 전담할 클래스)
public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        //피자 클래스에서 직접 인스턴스를 생성하는게 아니라 Factory 객체에서 대신 피자 종류결정
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new Pepperoni();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
