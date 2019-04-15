package cm.domain;

public class CoffeeMachine {

    WaterTank waterTank;
    CoffeeTank coffeeTank;
    WaterHeater waterHeater;
    CoffeeGrinder coffeeGrinder;

    public CoffeeMachine(WaterTank waterTank, CoffeeTank coffeeTank,WaterHeater waterHeater, CoffeeGrinder coffeeGrinder) {
        this.waterTank = waterTank;
        this.coffeeTank = coffeeTank;
        this.waterHeater= waterHeater;
        this.coffeeGrinder=coffeeGrinder;
    }

    public void coffeeButton (){
    coffeeGrinder.grindCoffee();
    coffeeTank.giveCoffee();
    waterTank.giveWater();
    waterHeater.applyHeat();


    System.out.println("dupa a nie kawa");
}




}
