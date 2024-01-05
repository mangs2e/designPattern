package designPattern.observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements DisplayElement, Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("[Forecast] ");
        if (currentPressure > lastPressure) {
            System.out.println("날씨 좋음");
        } else if (currentPressure == lastPressure) {
            System.out.println("비슷함");
        } else if (currentPressure < lastPressure) {
            System.out.println("더 추움. 비가 올 확룔도 높음");
        }
    }
}
