package designPattern.decorator.startbuzz;

//음료 구현 클래스 (음료를 설명하는 문자열 설정, cost() 메소드 구현!)
public class Espresso extends Beverage{
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
