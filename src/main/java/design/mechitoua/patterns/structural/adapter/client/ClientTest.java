package design.mechitoua.patterns.structural.adapter.client;

import design.mechitoua.patterns.structural.adapter.MobileAdapter;
import design.mechitoua.patterns.structural.adapter.WallSocket;
import design.mechitoua.patterns.structural.adapter.impl.MobileAdapterImpl;
import design.mechitoua.patterns.structural.adapter.impl.WallSocketImpl;
import design.mechitoua.patterns.structural.adapter.model.Volt;

public class ClientTest {
    public static void main(String[] args) {
        WallSocket wallSocket = new WallSocketImpl();
        Volt v240 = wallSocket.getVolts();
        System.out.println(v240);

        MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
        Volt v3 = mobileAdapter.get3Volt();
        System.out.println(v3);
    }
}
