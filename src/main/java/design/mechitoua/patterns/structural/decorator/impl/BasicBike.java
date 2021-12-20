package design.mechitoua.patterns.structural.decorator.impl;

import design.mechitoua.patterns.structural.decorator.Bike;

public class BasicBike implements Bike {
    @Override
    public void assembleBike() {
        System.out.println("Basic Bike...");
    }
}
