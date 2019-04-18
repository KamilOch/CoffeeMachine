
import cm.domain.*;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CoffeeMachineTest2 {

    WaterTank waterTank2 = new WaterTank() {
        @Override
        public void giveWater() {
            System.out.println("podaje wode z wlasnego mocka");
        }
    };





    CoffeeTank coffeeTank = mock(CoffeeTank.class);
    WaterHeater waterHeater = mock(WaterHeater.class);
    CoffeeGrinder coffeeGrinder = mock(CoffeeGrinder.class);
    SugarTank sugarTank = mock(SugarTank.class);
    MilkTank milkTank = mock(MilkTank.class);
    CupContainer cupContainer = mock(CupContainer.class);
    Display display = mock(Display.class);
    CashCounter cashCounter = mock(CashCounter.class);

    CoffeeMachine cmTest = new CoffeeMachine(waterTank2,coffeeTank,waterHeater, coffeeGrinder, sugarTank, milkTank, cupContainer, display, cashCounter);


    @Test
    public void shouldMakeBlackCoffee(){
        // Given
        when(cashCounter.countCash()).thenReturn(5);
        // When
        cmTest.coffeeBlackButton();
        // Then
        verify(cupContainer).putCup();
        verify(coffeeGrinder).grindCoffee();
        verify(coffeeTank).giveCoffee();
        verify(sugarTank, times(2)).adSugar();
        verify(waterHeater).applyHeat();

        //verify(waterTank, times (3)).giveWater();
        verify(display).displayMessage("Kawa Czarna gotowa");
        verifyZeroInteractions(milkTank);
        verify(cashCounter).restCash(3);
    }

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
    // tu jest cos nie tak !!!!!!!
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

}
