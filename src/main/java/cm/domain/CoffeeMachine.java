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
/*
    public void putCash (){
        cash +=cashCounter.countCash();
    }
*/
    private void giveBackCash(int rest){
        String restStr = String.valueOf(rest);
        cashCounter.restCash(rest);
        System.out.println("Wydaje reszte : "+ restStr+" PLN");

        cash=0;
    }

    private boolean haveEnoughMoney(int cost, int cash){
        if (cash<cost){
            return false;
        } else return true;
    }



    void sugarAmount(int cukier){

        for (int i=0; i<cukier; i++){
            sugarTank.addSugar();
        }
    }

    public void coffeeBlackButton (){
        int cost = 2;
        cash=cashCounter.countCash();
        if(haveEnoughMoney(cost,cash)) {
            cupContainer.putCup();
            coffeeGrinder.grindCoffee();
            coffeeTank.giveCoffee();
            sugarAmount(2);
            waterHeater.applyHeat();
            waterTank.giveWater();
            waterTank.giveWater();
            waterTank.giveWater();

            message = "Kawa Czarna gotowa";
            display.displayMessage(message);
            System.out.println(message);
            cash -=cost;
            giveBackCash(cash);

        } else {
            message="Za malo kasy";
            display.displayMessage(message);
            giveBackCash(cash);
        }
}
    public void coffeeEspressoButton(){
        int cost = 3;
        cash=cashCounter.countCash();
        if(haveEnoughMoney(cost, cash)) {
            cupContainer.putCup();
            coffeeGrinder.grindCoffee();
            coffeeTank.giveCoffee();
            sugarAmount(5);
            waterHeater.applyHeat();
            waterTank.giveWater();

            message = "Kawa Espresso gotowa";
            display.displayMessage(message);
            System.out.println(message);
            cash -=cost;
            giveBackCash(cash);

        } else display.displayMessage(message);
    }

    public void coffeeWhiteButton(){
        int cost = 4;
        cash=cashCounter.countCash();
        if(haveEnoughMoney(cost, cash)) {
            cupContainer.putCup();
            coffeeGrinder.grindCoffee();
            coffeeTank.giveCoffee();
            sugarAmount(1);
            milkTank.addMilk();
            waterHeater.applyHeat();
            waterTank.giveWater();
            waterTank.giveWater();

            message = "Kawa Biala gotowa";
            display.displayMessage(message);
            System.out.println(message);
            cash -=cost;
            giveBackCash(cash);
        } else display.displayMessage(message);

    }




}
