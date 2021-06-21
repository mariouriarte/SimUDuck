import behaviors.fly.FlyRocketPowered;
import models.*;

public class MiniDuckSimulator {

    public static void main (String[] args) {
        System.out.println("Simulator UDUCK");

        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.turnOnBattery();
        mallarDuck.performQuack();
        mallarDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.turnOnBattery();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.turnOnBattery();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        Duck rubbertDuck = new RubberDuck();
        rubbertDuck.display();
        rubbertDuck.turnOnBattery();
        rubbertDuck.performFly();
        rubbertDuck.performQuack();

        Duck roboDuck = new RoboDuck();
        roboDuck.display();
        roboDuck.turnOnBattery();
        roboDuck.performFly();
        roboDuck.performQuack();
    }
}
