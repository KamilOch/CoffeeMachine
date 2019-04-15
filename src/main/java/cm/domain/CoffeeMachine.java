package cm.domain;

public class CoffeeMachine {

    WaterTank waterTank;
    CoffeeTank coffeeTank;
    WaterHeater waterHeater;
    CoffeeGrinder coffeeGrinder;
    SugarTank sugarTank;

    public CoffeeMachine(WaterTank waterTank, CoffeeTank coffeeTank,WaterHeater waterHeater, CoffeeGrinder coffeeGrinder, SugarTank sugarTank) {
        this.waterTank = waterTank;
        this.coffeeTank = coffeeTank;
        this.waterHeater = waterHeater;
        this.coffeeGrinder = coffeeGrinder;
        this.sugarTank = sugarTank;
    }

    public void coffeeButton (){
    coffeeGrinder.grindCoffee();
    coffeeTank.giveCoffee();
    sugarTank.adSugar();
    sugarTank.adSugar();
    waterTank.giveWater();
    waterHeater.applyHeat();


    System.out.println("dupa a nie kawa");
}




}
