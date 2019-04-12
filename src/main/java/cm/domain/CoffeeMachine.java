package cm.domain;

public class CoffeeMachine {

    WaterTank waterTank = new WaterTank();

public void coffeeButton (){
    waterTank.openWaterValve();
    System.out.println("dupa a nie kawa");
}




}
