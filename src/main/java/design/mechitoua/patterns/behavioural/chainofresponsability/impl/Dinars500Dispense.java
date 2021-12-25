package design.mechitoua.patterns.behavioural.chainofresponsability.impl;

import design.mechitoua.patterns.behavioural.chainofresponsability.atm.Currency;
import design.mechitoua.patterns.behavioural.chainofresponsability.chain.MoneyDispenseChain;

public class Dinars500Dispense implements MoneyDispenseChain {
    private MoneyDispenseChain moneyDispenseChain;

    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 500) {
            int numOfNotes = currency.getAmount() / 500;
            int remainder = currency.getAmount() % 500;
            System.out.println("Dispensing " + numOfNotes + " note(s) of 500 dinars");
            if (remainder != 0) {
                moneyDispenseChain.dispense(new Currency(remainder));
            }
        } else {
            moneyDispenseChain.dispense(currency);
        }
    }
}
