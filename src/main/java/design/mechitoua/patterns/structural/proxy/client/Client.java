package design.mechitoua.patterns.structural.proxy.client;

import design.mechitoua.patterns.structural.proxy.VeryExpensiveProcess;
import design.mechitoua.patterns.structural.proxy.impl.VXPproxy;

public class Client {
    public static void main(String[] args) {
        VeryExpensiveProcess vxp = new VXPproxy();
        vxp.process();
        vxp.process();
    }
}
