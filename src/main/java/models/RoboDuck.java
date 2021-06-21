package models;

import behaviors.battery.BatteryTurnOnTurnOff;
import behaviors.battery.DontNeedBattery;
import behaviors.fly.FlyNoWay;
import behaviors.fly.FlyRocketPowered;
import behaviors.quack.Squeak;


public class RoboDuck extends Duck{

    private boolean powerOn = true;

    public RoboDuck() {
        this.typeDuck = "RoboDuck";
        quackBehavior = new Squeak();
        flyBehavior = new FlyRocketPowered();
        batteryBehavior = new BatteryTurnOnTurnOff();
    }
}
