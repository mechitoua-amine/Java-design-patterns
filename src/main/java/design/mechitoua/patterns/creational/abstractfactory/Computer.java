package design.mechitoua.patterns.creational.abstractfactory;

public interface Computer {
    public abstract String ram();

    public abstract String hdd();

    public abstract String cpu();

    public boolean isGraphicsCardEnabled();

    public boolean isBluetoothEnabled();
}
