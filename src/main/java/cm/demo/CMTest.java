package cm.demo;

import cm.domain.*;

public class CMTest {
    public static void main(String[] args) throws InterruptedException {

        CoffeeTank coffeeTank = new DemoCoffeeTank();
        WaterTank waterTank = new DemoWaterTank();
        WaterHeater waterHeater = new DemoWaterHeater();
        CoffeeGrinder coffeeGrinder = new DemoCoffeeGrinder();
        SugarTank sugarTank = new DemoSugarTank();
        MilkTank milkTank = new DemoMilkTank();
        CupContainer cupContainer = new DemoCupContainer();

        CoffeeMachine coffeeMachine = new CoffeeMachine(waterTank,coffeeTank,waterHeater, coffeeGrinder, sugarTank, milkTank, cupContainer);

        coffeeMachine.coffeeButton();
        Thread.sleep(1000);


    }
}
