package cm.domain;

public class CoffeeMachine {

    WaterTank waterTank = new WaterTank();
    CoffeeTank coffeeTank = new CoffeeTank();

public void coffeeButton (){
    coffeeTank.giveCoffee();
    waterTank.giveWate();

    System.out.println("dupa a nie kawa");
}




}
