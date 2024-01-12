package designPattern.singleton;

//초코바를 만드는 객체로 싱글톤으로 사용할 객체! -> 멀티스레드를 사용할 때 싱글톤 패턴이 깨질 우려가 있음!
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance; //유일한 인스턴스를 저장할 정적 변수
    //멀티스레딩 문제 해결방법 3. DCL(Double-Checking Locking)을 사용! -> 인스턴스가 생성되어 있는지 확인한 다음 생성되어 있지 않았을 때만 동기화!
    //volatile 키워드 사용! (Java 5부터 사용가능) -> getInstance 메소드 변경 필요

    //멀티스레딩 문제 해결방법 2. 인스턴스를 시작하자마자 만들기
    //private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
    //처음부터 인스턴스를 만들어놓고 사용하면 멀티스레딩 문제를 해결할 수 있음
    //public static ChocolateBoiler getInstance() {
    //    return uniqueInstance; -> 이미 인스턴스가 존재하므로 리턴만 하면 됨
    //}

    private ChocolateBoiler() { //생성자를 private으로 설정
        empty = true;
        boiled = false;
    }

    //멀티스레딩 문제 해결방법 1. getInstance() 메소드를 동기화 시키기
    //public static synchronized ChocolateBoiler getInstance()로 설정해서 getInstance 메소드를 사용할 때 동기화를 진행하도록 설정 가능!
    //이로 인해 성능이 심하게 저하되며 병목으로 작용한다면 다른 방법 사용해야함!

    public static ChocolateBoiler getInstance() { //유일한 인스턴스를 호출하여 사용할 메소드 (public으로 설정)
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    //멀티스레딩 문제 해결방법 3. DCL(Double-Checking Locking)을 사용! -> 이렇게 사용하면 처음 인스턴스를 생성할 때만 동기화를 시켜주고 이후에는 동기화 필요없음
    public static ChocolateBoiler getInstaceDCL() {
        if (uniqueInstance == null) { //인스턴스가 있는지 확인하고 없으면 동기화된 블럭 실행
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
