package designPattern.command.simpleRemote;

//버튼이 하나밖에 없는 간단한 리모콘 클래스
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    //버튼이 눌려지면 해당 메소드 호출
    public void buttonWasPressed() {
        slot.execute();
    }
}
