package cm.domain;

public class CoffeeMachine {

    WaterTank waterTank;
    CoffeeTank coffeeTank;

    public CoffeeMachine(WaterTank waterTank, CoffeeTank coffeeTank) {
        this.waterTank = waterTank;
        this.coffeeTank = coffeeTank;
    }

    public void coffeeButton (){
    coffeeTank.giveCoffee();
    waterTank.giveWater();

    System.out.println("dupa a nie kawa");
}




}
