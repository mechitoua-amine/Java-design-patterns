package design.mechitoua.patterns.structural.proxy.impl;

import design.mechitoua.patterns.structural.proxy.VeryExpensiveProcess;

public class VXPimpl implements VeryExpensiveProcess {
    public VXPimpl() {
        heavyInitialConfSetup();
    }

    @Override
    public void process() {
        System.out.println("VXPimpl.process(), Processing is done");
    }

    private void heavyInitialConfSetup() {
        System.out.println("VXPimpl.heavyInitialConfSetup(), setting up intial configuration");
    }
}
