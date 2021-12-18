package design.mechitoua.patterns.structural.composite.component.leaf;

import design.mechitoua.patterns.structural.composite.component.Service;

public class EmployeeService implements Service {
    @Override
    public void service(String serviceType) {
        System.out.println("EmployeeService: " + serviceType);
    }
}
