package designPattern.command.remoteAPI;

import designPattern.command.remoteAPI.Light;

//전등을 켜기 위한 커맨드 클래스
public class LightOnCommand implements Command {
    Light light;

    //"거실 전등" 이런 식으로 어떤 전등인지에 대한 정보 전달
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
