package cm.demo;

import cm.domain.CashCounter;

public class DemoCashCounter implements CashCounter {
    @Override
    public int countCash() {
        return 5;
    }

    @Override
    public int restCash(int reszta) {
        return reszta;
    }
}
