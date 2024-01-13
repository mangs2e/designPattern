package designPattern.command.simpleRemote;

public class GarageDoorOpendCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpendCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
