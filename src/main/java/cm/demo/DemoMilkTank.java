package cm.demo;

import cm.domain.MilkTank;

public class DemoMilkTank implements MilkTank {
    @Override
    public void addMilk() {
        System.out.println("dodaje porcje mleka");
    }
}
