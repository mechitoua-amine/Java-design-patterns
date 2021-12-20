package design.mechitoua.patterns.structural.decorator.impl;

import design.mechitoua.patterns.structural.decorator.Bike;

public class DecoratorBike implements Bike {
    private Bike bike;

    public DecoratorBike(Bike bike) {
        super();
        this.bike = bike;
    }

    @Override
    public void assembleBike() {
        bike.assembleBike();
    }
}
