package design.mechitoua.patterns.behavioural.chainofresponsability.impl;

import design.mechitoua.patterns.behavioural.chainofresponsability.atm.Currency;
import design.mechitoua.patterns.behavioural.chainofresponsability.chain.MoneyDispenseChain;

public class Dinars1000Dispense implements MoneyDispenseChain {
    private MoneyDispenseChain moneyDispenseChain;

    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 1000) {
            int numOfNotes = currency.getAmount() / 1000;
            int remainder = currency.getAmount() % 1000;
            System.out.println("Dispensing " + numOfNotes + " note(s) of 1000 dinars");
            if (remainder != 0) {
                moneyDispenseChain.dispense(new Currency(remainder));
            }
        } else {
            moneyDispenseChain.dispense(currency);
        }
    }
}
