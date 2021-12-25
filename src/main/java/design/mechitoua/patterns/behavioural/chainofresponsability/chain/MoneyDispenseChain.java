package design.mechitoua.patterns.behavioural.chainofresponsability.chain;

import design.mechitoua.patterns.behavioural.chainofresponsability.atm.Currency;

public interface MoneyDispenseChain {
    public abstract void setNextChain(MoneyDispenseChain moneyDispenseChain);

    public abstract void dispense(Currency currency);
}
