package design.mechitoua.patterns.behavioural.strategy.impl;

import design.mechitoua.patterns.behavioural.strategy.PaymentMethod;

public class CreditCardMethod implements PaymentMethod {

    private String cardHolderName;
    private String card;
    private String cvv;
    private String expiryDate;

    public CreditCardMethod(String cardHolderName, String card, String cvv, String expiryDate) {
        this.cardHolderName = cardHolderName;
        this.card = card;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCard() {
        return card;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using credit card with number " + card);
    }
}
