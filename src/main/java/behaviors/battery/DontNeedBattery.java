package behaviors.battery;

public class DontNeedBattery implements BatteryBehavior {
    @Override
    public void turnOn() {
        System.out.println("I don't need battery");
    }

    @Override
    public void turnOff()  {
        System.out.println("I don't need battery");
    }
}
