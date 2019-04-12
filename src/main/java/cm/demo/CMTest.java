package cm.demo;

import cm.domain.CoffeeMachine;

public class CMTest {
    public static void main(String[] args) throws InterruptedException {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.coffeeButton();
        Thread.sleep(1000);



    }
}
