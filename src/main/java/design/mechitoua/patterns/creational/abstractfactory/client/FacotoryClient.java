package design.mechitoua.patterns.creational.abstractfactory.client;

import design.mechitoua.patterns.creational.abstractfactory.Computer;
import design.mechitoua.patterns.creational.abstractfactory.ComputerFactory;
import design.mechitoua.patterns.creational.abstractfactory.LaptopFactory;
import design.mechitoua.patterns.creational.abstractfactory.PCFactory;
import design.mechitoua.patterns.creational.abstractfactory.ServerFactory;

public class FacotoryClient {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer(
                new PCFactory("16GB", "1TB", "Intel i7", true, true));
        System.out.println("PC Configuration: " + computer);

        Computer laptop = ComputerFactory.getComputer(
                new LaptopFactory("8GB", "500GB", "Intel i5", true, true));
        System.out.println("Laptop Configuration: " + laptop);

        Computer server = ComputerFactory.getComputer(
                new ServerFactory("32GB", "2TB", "Intel i9", true, true));
        System.out.println("Server Configuration: " + server);
    }
}
