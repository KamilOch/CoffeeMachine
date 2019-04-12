package cm.demo;

import cm.domain.WaterHeater;

public class DemoWaterHeater implements WaterHeater {
    @Override
    public void applyHeat() {
        System.out.println("Grzej wode");
    }
}
