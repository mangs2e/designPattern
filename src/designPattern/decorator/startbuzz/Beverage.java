package designPattern.decorator.startbuzz;

//음료 추상클래스
public abstract class Beverage {
    String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost(); //서브클래스에서 구현
}
