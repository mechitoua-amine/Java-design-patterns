package design.mechitoua.patterns.creational.abstractfactory.impl;

import design.mechitoua.patterns.creational.abstractfactory.Computer;

public class PC implements Computer {
    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public PC(String ram, String hdd, String cpu, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public String ram() {
        return ram;
    }

    @Override
    public String hdd() {
        return hdd;
    }

    @Override
    public String cpu() {
        return cpu;
    }

    @Override
    public boolean isGraphicsCardEnabled() {
        return true;
    }

    @Override
    public boolean isBluetoothEnabled() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PC [cpu=");
        builder.append(cpu);
        builder.append(", hdd=");
        builder.append(hdd);
        builder.append(", isBluetoothEnabled=");
        builder.append(isBluetoothEnabled);
        builder.append(", isGraphicsCardEnabled=");
        builder.append(isGraphicsCardEnabled);
        builder.append(", ram=");
        builder.append(ram);
        builder.append("]");
        return builder.toString();
    }
}
