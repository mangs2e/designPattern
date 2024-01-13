package designPattern.command.remoteAPI;

//리모컨 코드 (인보커 역할)
public class RemoteControl {
    //다섯 개의 on, off 명령을 처리할 수 있음, 각 명령은 배열에 저장
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        //아무것도 하지 않는 커맨드 클래스 noCommand 구현 -> 매번 onCommands[slot] != null을 비교하는게 번거로워서
        //초기화할 때 아무것도 하지 않는 기본 커맨드 객체를 모든 슬롯에 집어넣었음 -> 이렇게 하면 굳이 null을 비교하지 않아도 상관없음
        Command noCommand = new NoCommand();
        for (int i = 0; i < 5; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    //slot 번호와 그 슬롯이 저장할 on off 명령을 인자로 전달받음
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
