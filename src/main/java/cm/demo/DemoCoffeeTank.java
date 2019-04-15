package cm.demo;

import cm.domain.CoffeeTank;

public class DemoCoffeeTank implements CoffeeTank {
    @Override
    public void giveCoffee (){
        System.out.println("podaje kawe");
    }
}
