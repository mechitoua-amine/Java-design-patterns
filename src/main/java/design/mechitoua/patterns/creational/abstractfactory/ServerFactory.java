package design.mechitoua.patterns.creational.abstractfactory;

import design.mechitoua.patterns.creational.abstractfactory.impl.Server;

public class ServerFactory implements AbstractComputerFactory {
    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ServerFactory(String ram, String hdd, String cpu, boolean isGraphicsCardEnabled,
            boolean isBluetoothEnabled) {
        super();
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu, isGraphicsCardEnabled, isBluetoothEnabled);
    }
}
