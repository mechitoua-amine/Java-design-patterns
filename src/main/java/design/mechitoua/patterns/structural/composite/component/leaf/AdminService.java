package design.mechitoua.patterns.structural.composite.component.leaf;

import design.mechitoua.patterns.structural.composite.component.Service;

public class AdminService implements Service {
    @Override
    public void service(String serviceType) {
        System.out.println("AdminService: " + serviceType);
    }
}
