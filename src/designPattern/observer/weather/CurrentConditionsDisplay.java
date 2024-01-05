package designPattern.observer.weather;

//현재 기상 조건을 표시하는 디스플레이
public class CurrentConditionsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    //생성자에 weatherData라는 주제 객체가 전달되며, 그 객체를 써서 디스플레이를 옵저버로 등록
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display(); //update가 호출되면 기온과 습도를 저장하고 display()를 호출하도록!
    }

    @Override
    public void display() {
        System.out.printf("[Current conditions] 현재 온도 : %.2f, 현재 습도 : %.2f%n", temperature, humidity);
    }
}
