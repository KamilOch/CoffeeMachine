import cm.domain.*;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CoffeeMachineTest {

    WaterTank waterTank = mock(WaterTank.class);
    CoffeeTank coffeeTank = mock(CoffeeTank.class);
    WaterHeater waterHeater = mock(WaterHeater.class);
    CoffeeGrinder coffeeGrinder = mock(CoffeeGrinder.class);
    SugarTank sugarTank = mock(SugarTank.class);
    MilkTank milkTank = mock(MilkTank.class);
    CupContainer cupContainer = mock(CupContainer.class);
    Display display = mock(Display.class);

    CoffeeMachine cmTest = new CoffeeMachine(waterTank,coffeeTank,waterHeater, coffeeGrinder, sugarTank, milkTank, cupContainer, display);


    @Test
    public void shouldMakeBlackCoffee(){
        // Given

        // When
        cmTest.coffeeBlackButton();
        // Then
        verify(cupContainer).putCup();
        verify(coffeeGrinder).grindCoffee();
        verify(coffeeTank).giveCoffee();
        verify(sugarTank, times(2)).adSugar();
        verify(waterHeater).applyHeat();
        verify(waterTank, times (3)).giveWater();
        verify(display).displayMessage("Kawa Czarna gotowa");
        verifyZeroInteractions(milkTank);

    }

    @Test
    public void shouldMakeEspressoCoffee(){
        // Given

        // When
        cmTest.coffeeEspressoButton();
        // Then
        verify(cupContainer).putCup();
        verify(coffeeGrinder).grindCoffee();
        verify(coffeeTank).giveCoffee();
        verify(sugarTank, times(5)).adSugar();
        verify(waterHeater).applyHeat();
        verify(waterTank, times (1)).giveWater();
        verify(display).displayMessage("Kawa Espresso gotowa");
        verifyZeroInteractions(milkTank);
    }

    @Test
    public void shouldMakeWhiteCoffee(){
        // Given

        // When
        cmTest.coffeeWhiteButton();
        // Then
        verify(cupContainer).putCup();
        verify(coffeeGrinder).grindCoffee();
        verify(coffeeTank).giveCoffee();
        verify(sugarTank, times(1)).adSugar();
        verify(milkTank).addMilk();
        verify(waterHeater).applyHeat();
        verify(waterTank, times (2)).giveWater();
        verify(display).displayMessage("Kawa Biala gotowa");

    }


}
