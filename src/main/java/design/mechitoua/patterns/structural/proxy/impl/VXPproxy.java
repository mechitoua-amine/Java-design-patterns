package design.mechitoua.patterns.structural.proxy.impl;

import design.mechitoua.patterns.structural.proxy.VeryExpensiveProcess;

public class VXPproxy implements VeryExpensiveProcess {
    private static VeryExpensiveProcess vxObject;

    // now we will utilize the Proxy pattern and initialize our expensive object
    // on demand
    @Override
    public void process() {
        if (vxObject == null) {
            vxObject = new VXPimpl();
        }
        vxObject.process();
    }
}
