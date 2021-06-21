package models;

import behaviors.battery.DontNeedBattery;
import behaviors.fly.FlyNoWay;
import behaviors.quack.MuteQuack;
import behaviors.quack.Quack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.typeDuck = "Rubber Duck";
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        batteryBehavior = new DontNeedBattery();
    }
}
