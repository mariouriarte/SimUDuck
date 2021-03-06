package models;

import behaviors.battery.DontNeedBattery;
import behaviors.fly.FlyNoWay;
import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        this.typeDuck = "Mallard Duck";
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
        batteryBehavior = new DontNeedBattery();
    }
}
