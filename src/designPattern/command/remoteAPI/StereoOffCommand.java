package designPattern.command.remoteAPI;

//오디오를 켤 때 자동으로 CD가 재생되도록 하는 클래스
public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
