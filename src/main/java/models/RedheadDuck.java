package models;

import behaviors.battery.DontNeedBattery;
import behaviors.fly.FlyNoWay;
import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.typeDuck = "Redhead Duck";
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        batteryBehavior = new DontNeedBattery();
    }
}
