package cm.domain;

public class CoffeeMachine {

    WaterTank waterTank;
    CoffeeTank coffeeTank;
    WaterHeater waterHeater;

    public CoffeeMachine(WaterTank waterTank, CoffeeTank coffeeTank,WaterHeater waterHeater) {
        this.waterTank = waterTank;
        this.coffeeTank = coffeeTank;
        this.waterHeater= waterHeater;
    }

    public void coffeeButton (){
    coffeeTank.giveCoffee();
    waterTank.giveWater();
    waterHeater.applyHeat();


    System.out.println("dupa a nie kawa");
}




}
