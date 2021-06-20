import models.Duck;
import models.MallarDuck;

public class SimUDuck {

    public static void main (String[] args) {
        System.out.println("Simulator UDUCK");

        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

    }

}
