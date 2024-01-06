package designPattern.decorator.startbuzz;

//첨가물 구현 클래스 (데코레이터 구현 클래스)
public class Mocha extends CondimentDecorator{
    Beverage beverage; //감싸고자 하는 음료를 저장하기 위한 인스턴스 변수

    public Mocha(Beverage beverage) { //생성자를 이용해서 감싸고자 하는 음료 객체를 전달하는 방식 사용
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20; //감싼 음료에 대한 가격과 첨가물 가격 합산 메소드
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 모카"; //감싼 음료에 대한 정보와 현재 첨가물 정보를 알려주는 메소드
    }
}
