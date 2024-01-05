package designPattern.observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

//현재 기상 조건을 표시하는 디스플레이
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Observable observable;

    //Observable을 인자로 받아들인 다음, 그 레퍼런스를 써서 옵저버로 등록
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    //Observable 객체가 WeatherData인지 확인한 다음 게터를 이용해서 필요한 정보만 가져옴
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("[Current conditions] 현재 온도 : %.2f, 현재 습도 : %.2f%n", temperature, humidity);
    }
}
