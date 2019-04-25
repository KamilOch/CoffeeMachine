package cm.demo;

import cm.domain.SugarTank;

public class DemoSugarTank implements SugarTank {
    @Override
    public void addSugar() {
        System.out.println("podaje porcje cukru");
    }
}
