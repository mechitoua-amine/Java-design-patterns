package design.mechitoua.patterns.structural.adapter.impl;

import design.mechitoua.patterns.structural.adapter.MobileAdapter;
import design.mechitoua.patterns.structural.adapter.WallSocket;
import design.mechitoua.patterns.structural.adapter.model.Volt;

public class MobileAdapterImpl implements MobileAdapter {
    private WallSocket wallSocket;

    public MobileAdapterImpl(WallSocket wallSocket) {
        this.wallSocket = wallSocket;
    }

    @Override
    public Volt get3Volt() {
        Volt volt240 = wallSocket.getVolts();
        int volt3 = volt240.getVolts() / 80;
        return new Volt(volt3);
    }
}
