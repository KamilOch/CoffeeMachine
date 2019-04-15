package cm.demo;

import cm.domain.Display;

public class DemoDisplay implements Display {
    @Override
    public void displayMessage(String message) {
        System.out.println("Wyswietlacz wyswietla: "+message);
    }
}
