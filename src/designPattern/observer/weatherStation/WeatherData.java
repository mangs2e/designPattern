package designPattern.observer.weatherStation;

import java.util.ArrayList;

//기상 스테이션에서 데이터들을 가져와 처리하는 클래스
public class WeatherData implements Subject {
    private ArrayList observers; //옵저버를 관리할 리스트
    private float temperature; //온도
    private float humidity; //습도
    private float pressure; //기압

    public WeatherData() {
        observers = new ArrayList(); //생성자에서 list 객체 생성
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    // ****** 중요한 부분 ******
    // 상태에 대해서 모든 옵저버들한테 알려주는 부분
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer) observers.get(i);
            o.update(temperature, humidity, pressure);
        }
    }

    //기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들한테 알리는 메소드
    public void measurementsChanged() {
        notifyObserver();
    }

    //기상 스테이션으로부터 갱신된 측정치를 받아오는 메소드
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
