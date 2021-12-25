package design.mechitoua.patterns.behavioural.chainofresponsability.impl;

import design.mechitoua.patterns.behavioural.chainofresponsability.chain.MoneyDispenseChain;

public class ATMDispense {
    private MoneyDispenseChain moneyDispenseChain1;

    public ATMDispense() {
        moneyDispenseChain1 = new Dinars2000Dispense();
        MoneyDispenseChain moneyDispenseChain2 = new Dinars1000Dispense();
        MoneyDispenseChain moneyDispenseChain3 = new Dinars500Dispense();

        moneyDispenseChain1.setNextChain(moneyDispenseChain2);
        moneyDispenseChain2.setNextChain(moneyDispenseChain3);
    }

    public MoneyDispenseChain getMoneyDispenseChain1() {
        return moneyDispenseChain1;
    }
}
