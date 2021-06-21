package models;

import behaviors.battery.BatteryBehavior;
import behaviors.fly.FlyBehavior;
import behaviors.quack.QuackBehavior;

public abstract class Duck {
    private String name;
    private Integer age;
    private String color;
    protected String typeDuck;

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    BatteryBehavior batteryBehavior;

    @Override
    public String toString() {
        return typeDuck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void swim() {
        System.out.println("Duck " + name + ": All duck float, even decoys!");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void turnOnBattery() {
        batteryBehavior.turnOn();
    }

    public void setFlyBehavior(FlyBehavior newFlyBehavior) {
        flyBehavior = newFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior newQuackBehavior) {
        quackBehavior = newQuackBehavior;
    }

    public void setBatteryBehavior(BatteryBehavior newBatteryBehavior) {
        batteryBehavior= newBatteryBehavior;
    }

    public void display() {
        System.out.println("");
        System.out.println("Looks like a " + this.typeDuck);
    }

}
