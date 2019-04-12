package cm.demo;

import cm.domain.CoffeeMachine;
import cm.domain.CoffeeTank;
import cm.domain.WaterTank;

public class CMTest {
    public static void main(String[] args) throws InterruptedException {

        CoffeeTank coffeeTank = new DemoCoffeeTank();
        WaterTank waterTank = new DemoWaterTank();

        CoffeeMachine coffeeMachine = new CoffeeMachine(waterTank,coffeeTank);

        coffeeMachine.coffeeButton();
        Thread.sleep(1000);



    }
}
