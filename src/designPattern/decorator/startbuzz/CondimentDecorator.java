package designPattern.decorator.startbuzz;

//첨가물을 나타내는 추상 클래스(데코레이터 클래스)
//Bevarage 객체가 들어갈 자리에 데코레이터 객체가 들어갈 수 있어야 하므로 Beverage 클래스를 확장
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription(); //모든 첨가물 데코레이터에서 getDescription 메소드를 새로 구현하도록!
}
