package design.mechitoua.patterns.structural.composite.client;

import design.mechitoua.patterns.structural.composite.component.Service;
import design.mechitoua.patterns.structural.composite.component.leaf.AdminService;
import design.mechitoua.patterns.structural.composite.component.leaf.EmployeeService;
import design.mechitoua.patterns.structural.composite.composites.ServiceProvider;

public class Client {
    public static void main(String[] args) {
        Service employeeService1 = new EmployeeService();
        Service employeeService2 = new EmployeeService();
        Service adminService = new AdminService();

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.addService(employeeService1);
        serviceProvider.addService(employeeService2);
        serviceProvider.addService(adminService);
        serviceProvider.service("Registering service");
        serviceProvider.removeService(employeeService2);

        serviceProvider.addService(new AdminService());
        System.out.println("---------------------------------------");
        serviceProvider.service("Logout service");
    }
}
