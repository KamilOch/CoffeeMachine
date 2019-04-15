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
    String message;

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

    public void coffeeBlackButton (){
        cupContainer.putCup();
        coffeeGrinder.grindCoffee();
        coffeeTank.giveCoffee();

        sugarTank.adSugar();
        sugarTank.adSugar();

        waterHeater.applyHeat();
        waterTank.giveWater();

        message = "Kawa Czarna gotowa";
        display.displayMessage(message);
}
    public void coffeeExpressoButton(){
        cupContainer.putCup();
        coffeeGrinder.grindCoffee();
        coffeeTank.giveCoffee();

        sugarTank.adSugar();
        sugarTank.adSugar();

        waterHeater.applyHeat();
        waterTank.giveWater();

        message = "Kawa Expresso gotowa";
        display.displayMessage(message);
    }

    public void coffeeWhiteButton(){
        cupContainer.putCup();
        coffeeGrinder.grindCoffee();
        coffeeTank.giveCoffee();

        sugarTank.adSugar();
        sugarTank.adSugar();
        milkTank.addMilk();
        waterHeater.applyHeat();
        waterTank.giveWater();

        message = "Kawa Biala gotowa";
        display.displayMessage(message);

    }




}
