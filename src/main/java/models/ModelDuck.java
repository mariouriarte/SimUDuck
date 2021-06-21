package models;

import behaviors.battery.BatteryTurnOnTurnOff;
import behaviors.fly.FlyNoWay;
import behaviors.quack.MuteQuack;
import behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.typeDuck = "Model Duck";
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        batteryBehavior = new BatteryTurnOnTurnOff();
    }
}
