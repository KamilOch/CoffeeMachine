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
        Display display = new DemoDisplay();

        CoffeeMachine coffeeMachine = new CoffeeMachine(waterTank,coffeeTank,waterHeater, coffeeGrinder, sugarTank, milkTank, cupContainer, display);

        coffeeMachine.coffeeBlackButton();
        Thread.sleep(1000);
        coffeeMachine.coffeeExpressoButton();
        Thread.sleep(1000);
        coffeeMachine.coffeeWhiteButton();
        Thread.sleep(1000);


    }
}
