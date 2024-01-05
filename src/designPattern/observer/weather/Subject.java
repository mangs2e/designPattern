package designPattern.observer.weather;

//주제 인터페이스
public interface Subject {
    public void registerObserver(Observer observer); //옵저버 객체 등록

    public void removeObserver(Observer observer); //옵저버 객체 삭제

    public void notifyObserver(); //주제 객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기 위해 호출되는 메소드
}
