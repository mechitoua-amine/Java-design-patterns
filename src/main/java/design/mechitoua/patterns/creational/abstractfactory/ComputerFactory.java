package design.mechitoua.patterns.creational.abstractfactory;

public class ComputerFactory {
    private ComputerFactory() {
    }

    public static Computer getComputer(AbstractComputerFactory absFactory) {
        return absFactory.createComputer();
    }
}
