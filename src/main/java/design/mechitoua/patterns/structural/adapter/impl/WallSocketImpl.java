package design.mechitoua.patterns.structural.adapter.impl;

import design.mechitoua.patterns.structural.adapter.WallSocket;
import design.mechitoua.patterns.structural.adapter.model.Volt;

public class WallSocketImpl implements WallSocket {
    @Override
    public Volt getVolts() {
        return new Volt(240);
    }
}
