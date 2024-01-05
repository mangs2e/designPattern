package designPattern.observer.weather;

//기상 정보가 변경되었을 때 옵저버한테 값들을 전달하는 옵저버 인터페이스
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
