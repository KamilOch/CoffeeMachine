package cm.demo;

import cm.domain.CoffeeTank;

public class DemoCoffeeTank implements CoffeeTank {
    @Override
    public void giveCoffee (){
        grindCoffee();
        System.out.println("podaje kawe");
    }
    @Override
    public void grindCoffee() {
        System.out.println("miele kawe");
    }
}
