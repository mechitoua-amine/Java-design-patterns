package design.mechitoua.patterns.creational.builder;

// Laptop class Using the builder pattern
public class Laptop {
    private String ram;
    private String hdd;
    private String cpu;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Laptop(LaptopBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.cpu = builder.cpu;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public static class LaptopBuilder {
        private String ram;
        private String hdd;
        private String cpu;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public LaptopBuilder(String ram, String hdd, String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public LaptopBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Laptop [cpu=");
        builder.append(", ram=");
        builder.append(ram);
        builder.append(cpu);
        builder.append(", hdd=");
        builder.append(hdd);
        builder.append(", isGraphicsCardEnabled=");
        builder.append(isGraphicsCardEnabled);
        builder.append(", isBluetoothEnabled=");
        builder.append(isBluetoothEnabled);
        builder.append("]");
        return builder.toString();
    }

}
