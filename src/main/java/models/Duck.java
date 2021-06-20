package models;

import behaviors.fly.FlyBehavior;
import behaviors.quack.QuackBehavior;

public abstract class Duck {
    private String name;
    private Integer age;
    private String color;

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void Duck() {}

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

    public void display() {
        System.out.println("Duck " + name + ": Mostrando Pato");
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


}
