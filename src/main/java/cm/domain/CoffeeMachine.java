package cm.domain;

public class CoffeeMachine {

    WaterTank waterTank;
    CoffeeTank coffeeTank;
    WaterHeater waterHeater;
    CoffeeGrinder coffeeGrinder;
    SugarTank sugarTank;
    MilkTank milkTank;
    CupContainer cupContainer;
    Display display;

    public CoffeeMachine(WaterTank waterTank, CoffeeTank coffeeTank,WaterHeater waterHeater, CoffeeGrinder coffeeGrinder, SugarTank sugarTank, MilkTank milkTank, CupContainer cupContainer, Display display) {
        this.waterTank = waterTank;
        this.coffeeTank = coffeeTank;
        this.waterHeater = waterHeater;
        this.coffeeGrinder = coffeeGrinder;
        this.sugarTank = sugarTank;
        this.milkTank = milkTank;
        this.cupContainer = cupContainer;
        this.display = display;
    }

    public void coffeeButton (){
    cupContainer.putCup();
    coffeeGrinder.grindCoffee();
    coffeeTank.giveCoffee();
    sugarTank.adSugar();
    sugarTank.adSugar();
    milkTank.addMilk();
    waterTank.giveWater();
    waterHeater.applyHeat();


    System.out.println("dupa a nie kawa");
}




}
