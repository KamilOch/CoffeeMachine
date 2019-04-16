import cm.demo.*;
import cm.domain.*;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CoffeeMachineTest {

    WaterTank waterTank = mock(DemoWaterTank.class);
    CoffeeTank coffeeTank = mock(DemoCoffeeTank.class);
    WaterHeater waterHeater = mock(DemoWaterHeater.class);
    CoffeeGrinder coffeeGrinder = mock(DemoCoffeeGrinder.class);
    SugarTank sugarTank = mock(DemoSugarTank.class);
    MilkTank milkTank = mock(DemoMilkTank.class);
    CupContainer cupContainer = mock(DemoCupContainer.class);
    Display display = mock(DemoDisplay.class);

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
        verify(waterHeater).applyHeat();
        verify(waterTank, times (2)).giveWater();
        verify(display).displayMessage("Kawa Biala gotowa");

    }


}
