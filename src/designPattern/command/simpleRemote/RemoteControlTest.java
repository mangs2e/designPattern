package designPattern.command.simpleRemote;

//리모콘 테스트 클래스 (클라이언트)
public class RemoteControlTest {
    public static void main(String[] args) {
        //remote 변수가 Invoker 역할을 수행! (웨이터)
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light(); //요청을 받아서 처리할 리시버 객체 생성 (주방장)
        LightOnCommand lightOn = new LightOnCommand(light); //커맨드 객체 생성 (주문서)

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpendCommand doorOpen = new GarageDoorOpendCommand(garageDoor);

        remote.setCommand(lightOn); //커맨드 객체를 인보커한테 전달
        remote.buttonWasPressed();
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
    }
}
