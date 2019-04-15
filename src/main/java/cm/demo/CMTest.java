package cm.demo;

import cm.domain.*;

public class CMTest {
    public static void main(String[] args) throws InterruptedException {

        CoffeeTank coffeeTank = new DemoCoffeeTank();
        WaterTank waterTank = new DemoWaterTank();
        WaterHeater waterHeater = new DemoWaterHeater();
        CoffeeGrinder coffeeGrinder = new DemoCoffeeGrinder();

        CoffeeMachine coffeeMachine = new CoffeeMachine(waterTank,coffeeTank,waterHeater, coffeeGrinder);

        coffeeMachine.coffeeButton();
        Thread.sleep(1000);


    }
}
