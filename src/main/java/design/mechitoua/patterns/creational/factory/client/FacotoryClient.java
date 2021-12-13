package design.mechitoua.patterns.creational.factory.client;

import design.mechitoua.patterns.creational.factory.Computer;
import design.mechitoua.patterns.creational.factory.ComputerFactory;
import design.mechitoua.patterns.creational.factory.ComputerType;

public class FacotoryClient {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer(ComputerType.PC, "16GB", "1TB", "Intel i7", true, true);
        System.out.println("PC Configuration: " + computer);

        Computer laptop = ComputerFactory.getComputer(ComputerType.PC, "8GB", "500GB", "Intel i5", true, true);
        System.out.println("Laptop Configuration: " + laptop);

        Computer server = ComputerFactory.getComputer(ComputerType.PC, "32GB", "2TB", "Intel i9", true, true);
        System.out.println("Server Configuration: " + server);
    }
}
