package cm.demo;

import cm.domain.WaterTank;

public class DemoWaterTank implements WaterTank {

    @Override
    public void giveWater() {
        System.out.println("podaje wode");
    }
}
