package designPattern.command.simpleRemote;

public class GarageDoor {
    public GarageDoor() {
    }

    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Closed");
    }

    public void stop() {
        System.out.println("Garage Door is stopped");
    }

    public void lightOn() {
        System.out.println("Garage Light is on");
    }

    public void lightOff() {
        System.out.println("Garage Light is off");
    }
}
