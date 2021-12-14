package design.mechitoua.patterns.creational.builder;

public class BuilderClient {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop.LaptopBuilder("8GB", "500GB", "i7").build();
        System.out.println("Laptop1 configuration: " + laptop1);

        Laptop laptop2 = new Laptop.LaptopBuilder("16GB", "1TB", "i7").setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true).build();
        System.out.println("Laptop2 configuration: " + laptop2);
    }
}
