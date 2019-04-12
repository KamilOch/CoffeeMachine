package cm.demo;

import cm.domain.WaterTank;

public class DemoWaterTank implements WaterTank {

    private void openWaterValve (){
        System.out.println("otwieram zawor wody");
    }

    @Override
    public void giveWater() {
        openWaterValve();
        System.out.println("podaje wode");
    }
}
