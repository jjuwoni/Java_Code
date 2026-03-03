package com.wanted.opp.c_abstraction.coffee;

public class Barista {
    private Machine mac = new Machine();
    public void turnOn() {
        mac.turnOn();
    }

    public void brewing() {
        mac.brewing();
    }

    public void reFill() {
        mac.reFill();
    }

    public void waching() {
        mac.washing();

    }

    public void turnOff() {
        mac.turnOff();
    }
}
