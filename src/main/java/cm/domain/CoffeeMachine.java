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
    CashCounter cashCounter;

    String message;
    int cash=0;


    public CoffeeMachine(WaterTank waterTank, CoffeeTank coffeeTank,WaterHeater waterHeater, CoffeeGrinder coffeeGrinder, SugarTank sugarTank, MilkTank milkTank, CupContainer cupContainer, Display display, CashCounter cashCounter) {
        this.waterTank = waterTank;
        this.coffeeTank = coffeeTank;
        this.waterHeater = waterHeater;
        this.coffeeGrinder = coffeeGrinder;
        this.sugarTank = sugarTank;
        this.milkTank = milkTank;
        this.cupContainer = cupContainer;
        this.display = display;
        this.cashCounter = cashCounter;
    }

    public void putCash (int put){
        cash +=put;
    }

    private void giveBackCash(int rest){
        System.out.println("Wydaje reszte : "+ cashCounter.restCash(rest)+" PLN");
        cash=0;
    }

    private boolean haveEnoughMoney(int cost){
        if (cash<cost){
            message="Za malo kasy";
            giveBackCash(cash);
            return false;
        } else return true;
    }



    void coffee (int cukier){

        for (int i=0; i<cukier; i++){
            sugarTank.adSugar();
        }
    }



    public void coffeeBlackButton (){
        int cost = 2;
        if(haveEnoughMoney(cost)) {
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
            cash -=cost;
            giveBackCash(cash);
        } else display.displayMessage(message);
}
    public void coffeeEspressoButton(){
        int cost = 3;
        if(haveEnoughMoney(cost)) {
            cupContainer.putCup();
            coffeeGrinder.grindCoffee();
            coffeeTank.giveCoffee();

            coffee(5);

            waterHeater.applyHeat();
            waterTank.giveWater();

            message = "Kawa Espresso gotowa";
            display.displayMessage(message);
            cash -=cost;
            giveBackCash(cash);
        } else display.displayMessage(message);
    }

    public void coffeeWhiteButton(){
        int cost = 4;
        if(haveEnoughMoney(cost)) {
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
            cash -=cost;
            giveBackCash(cash);
        } else display.displayMessage(message);

    }




}
