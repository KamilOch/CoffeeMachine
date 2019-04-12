package cm.domain;

public class CoffeeTank {

    public void giveCoffee (){
        grindCoffee();
        System.out.println("podaje kawe");
    }

    private void grindCoffee() {
        System.out.println("miele kawe");
    }
}
