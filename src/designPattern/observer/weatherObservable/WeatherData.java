package designPattern.observer.weatherObservable;

import java.util.Observable;

//자바 내장 객체 Observable 클래스 사용 (Java9 이후로 Deprecated)식 (pull 방식)
//Observable은 인터페이스가 아니므로 구현해줘야하는 메소드 없음
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {} //더이상 생성자에서 List를 생성할 필요 없음

    //기상 스테이션으로부터 갱신된 측정치를 받아오는 메소드
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged(); //notify를 호출하기 전에 setChanged를 먼저 호출해서 상태가 바뀌었다는 것을 알림
        notifyObservers(); //매개변수에 별다른 값이 없으므로 모든 옵저버를 대상으로!
    }

    //사실 직접 Observer 패턴을 구현할때도 존재했던 메소드이나 풀 방식을 사용할 때는 꼭!!
    //옵저버가 WeatherData 객체의 상태를 알아낼 때 getter 사용
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
