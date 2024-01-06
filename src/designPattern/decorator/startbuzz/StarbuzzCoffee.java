package designPattern.decorator.startbuzz;

//주문을 위한 테스트용 클래스
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast(); //아무것도 첨가하지 않은 다크로스트 커피
        System.out.printf("%s $%.2f%n", beverage1.getDescription(),beverage1.cost());

        Beverage beverage2 = new Decaf(); //스팀우유를 추가한 디카페인 커피
        beverage2 = new SteamMilk(beverage2);
        System.out.printf("%s $%.2f%n", beverage2.getDescription(),beverage2.cost());

        Beverage beverage3 = new HouseBlend(); //모카 2번, 휘핑 추가한 하우스 블렌드 커피
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.printf("%s $%.2f%n", beverage3.getDescription(),beverage3.cost());

    }
}
