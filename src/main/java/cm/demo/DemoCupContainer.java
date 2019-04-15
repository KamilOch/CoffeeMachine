package cm.demo;


import cm.domain.CupContainer;

public class DemoCupContainer implements CupContainer {
    @Override
    public void putCup() {
        System.out.println("podaje kubek");
    }
}
