package design.mechitoua.patterns.behavioural.chainofresponsability.client;

import design.mechitoua.patterns.behavioural.chainofresponsability.atm.Currency;
import design.mechitoua.patterns.behavioural.chainofresponsability.impl.ATMDispense;

public class Client {
    public static void main(String[] args) {
        ATMDispense atmDispense = new ATMDispense();

        while (true) {
            int amount = 0;
            System.out.print("Enter amount: ");
            try {
                amount = Integer.parseInt(System.console().readLine());

                if (amount % 500 != 0) {
                    System.out.println("Amount must be multiple of 500 Dinars");
                    return;
                } else {
                    atmDispense.getMoneyDispenseChain1().dispense(new Currency(amount));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount");
                e.printStackTrace();
            }
        }
    }
}
