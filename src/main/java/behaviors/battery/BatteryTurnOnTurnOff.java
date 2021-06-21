package behaviors.battery;

public class BatteryTurnOnTurnOff implements BatteryBehavior {
    @Override
    public void turnOn() {
        System.out.println("Battery is set to ON");
    }
}
