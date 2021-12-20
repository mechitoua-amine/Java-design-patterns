package design.mechitoua.patterns.structural.decorator.impl;

import design.mechitoua.patterns.structural.decorator.Bike;

public class SportBike extends DecoratorBike {

    public SportBike(Bike bike) {
        super(bike);
    }

    @Override
    public void assembleBike() {
        super.assembleBike();
        System.out.println("Adding features of sport bike");
    }
}
