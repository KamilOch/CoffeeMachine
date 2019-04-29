
import cm.domain.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CoffeeMachineTest2 {

    private String x = "a kuku";
    private String s = "null";
    int cash = 0;
    int price = 0;

    WaterTank waterTank2 = new WaterTank() {
        @Override
        public void giveWater() {
            s = "podaje wode z wlasnego mocka";
            System.out.println(s);
        }
    };

    CashCounter cashCounter2 = new CashCounter() {
        @Override
        public int countCash() {
            cash = 5;
            return cash;
        }

        @Override
        public int restCash(int rest) {
            rest -= price;
            return rest;
        }
    };


    CoffeeTank coffeeTank = mock(CoffeeTank.class);
    WaterHeater waterHeater = mock(WaterHeater.class);
    CoffeeGrinder coffeeGrinder = mock(CoffeeGrinder.class);
    TestSugarTank sugarTank2 = new TestSugarTank();
    MilkTank milkTank = mock(MilkTank.class);
    CupContainer cupContainer = mock(CupContainer.class);
    Display display = mock(Display.class);

    CoffeeMachine cmTest = new CoffeeMachine(waterTank2, coffeeTank, waterHeater, coffeeGrinder, sugarTank2, milkTank, cupContainer, display, cashCounter2);


    @Test
    public void shouldMakeBlackCoffee() {
        // Given
        //when(cashCounter.countCash()).thenReturn(5);
        cashCounter2.countCash();
        price = 2;
        // When
        cmTest.coffeeBlackButton();
        // Then
        verify(cupContainer).putCup();
        verify(coffeeGrinder).grindCoffee();
        verify(coffeeTank).giveCoffee();
        x = sugarTank2.getC();
        //verify(sugarTank, times(2)).adSugar();
        Assert.assertEquals("podaje porcje cukru z wlasnego mocka", x);

        verify(waterHeater).applyHeat();
        /*
        if (s.equals("podaje wode z wlasnego mocka")) {
            System.out.println("Test waterTank2 OK");
        } else System.out.println("Test waterTank2 NOK!!!!!!");
        */
        Assert.assertEquals("podaje wode z wlasnego mocka", s);
        //verify(waterTank, times (3)).giveWater();
        verify(display).displayMessage("Kawa Czarna gotowa");
        verifyZeroInteractions(milkTank);
        //verify(cashCounter2).restCash(3);
        Assert.assertEquals(3, cashCounter2.restCash(cash));
    }
/*
    @Test
    public void shouldMakeEspressoCoffee(){
        // Given
        when(cashCounter.countCash()).thenReturn(5);
        // When
        //cmTest.putCash();
        cmTest.coffeeEspressoButton();
        // Then
        verify(cupContainer).putCup();
        verify(coffeeGrinder).grindCoffee();
        verify(coffeeTank).giveCoffee();
        verify(sugarTank, times(5)).adSugar();
        verify(waterHeater).applyHeat();

        //verify(waterTank, times (1)).giveWater();
        verify(display).displayMessage("Kawa Espresso gotowa");
        verifyZeroInteractions(milkTank);
        verify(cashCounter).restCash(2);
    }

    @Test
    public void shouldMakeWhiteCoffee(){
        // Given
        when(cashCounter.countCash()).thenReturn(5);
        // When
        //cmTest.putCash();
        cmTest.coffeeWhiteButton();
        // Then
        verify(cupContainer).putCup();
        verify(coffeeGrinder).grindCoffee();
        verify(coffeeTank).giveCoffee();
        verify(sugarTank, times(1)).adSugar();
        verify(milkTank).addMilk();
        verify(waterHeater).applyHeat();

        //verify(waterTank, times (2)).giveWater();
        verify(display).displayMessage("Kawa Biala gotowa");
        verify(cashCounter).restCash(1);
    }

    @Test
    public void shouldAddMoneyThenDisplayNotEnoughMoney() {
        // Given
        when(cashCounter.countCash()).thenReturn(1);
        // When
        //cmTest.putCash();
        cmTest.coffeeBlackButton();
        // Then
        verify(display).displayMessage("Za malo kasy");
        verify(cashCounter).restCash(1);
    }
*/
}
