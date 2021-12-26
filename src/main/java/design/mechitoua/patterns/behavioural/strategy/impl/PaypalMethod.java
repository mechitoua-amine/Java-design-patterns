package design.mechitoua.patterns.behavioural.strategy.impl;

import design.mechitoua.patterns.behavioural.strategy.PaymentMethod;

public class PaypalMethod implements PaymentMethod {
    private String email;
    private String password;

    public PaypalMethod(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using paypal");
    }

}
