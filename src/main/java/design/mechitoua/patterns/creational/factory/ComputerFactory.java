package design.mechitoua.patterns.creational.factory;

import javax.management.RuntimeErrorException;

import design.mechitoua.patterns.creational.factory.impl.Laptop;
import design.mechitoua.patterns.creational.factory.impl.PC;
import design.mechitoua.patterns.creational.factory.impl.Server;

public class ComputerFactory {
    private ComputerFactory() {
    }

    public static Computer getComputer(ComputerType cType, String ram, String hdd, String cpu, boolean isGpu,
            boolean isblutooth) {

        switch (cType) {
            case PC:
                return new PC(ram, hdd, cpu, isGpu, isblutooth);
            case LAPTOP:
                return new Laptop(ram, hdd, cpu, isGpu, isblutooth);
            case SERVER:
                return new Server(ram, hdd, cpu, isGpu, isblutooth);
            default:
                throw new RuntimeErrorException(null, "Invalid Computer Type");
        }
    }
}
