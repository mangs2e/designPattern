package designPattern.decorator.startbuzz;

public class SteamMilk extends CondimentDecorator{
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 스팀 우유";
    }
}
