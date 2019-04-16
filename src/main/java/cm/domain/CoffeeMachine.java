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

    void coffee (int cukier){

        for (int i=0; i<cukier; i++){
            sugarTank.adSugar();
        }

    }



    public void coffeeBlackButton (){

        cupContainer.putCup();
        coffeeGrinder.grindCoffee();
        coffeeTank.giveCoffee();

        coffee(2);

        waterHeater.applyHeat();
        waterTank.giveWater();
        waterTank.giveWater();
        waterTank.giveWater();

        message = "Kawa Czarna gotowa";
        display.displayMessage(message);
}
    public void coffeeEspressoButton(){
        cupContainer.putCup();
        coffeeGrinder.grindCoffee();
        coffeeTank.giveCoffee();

        coffee(5);

        waterHeater.applyHeat();
        waterTank.giveWater();

        message = "Kawa Espresso gotowa";
        display.displayMessage(message);
    }

    public void coffeeWhiteButton(){
        cupContainer.putCup();
        coffeeGrinder.grindCoffee();
        coffeeTank.giveCoffee();

        coffee(1);

        milkTank.addMilk();
        waterHeater.applyHeat();
        waterTank.giveWater();
        waterTank.giveWater();

        message = "Kawa Biala gotowa";
        display.displayMessage(message);

    }




}
