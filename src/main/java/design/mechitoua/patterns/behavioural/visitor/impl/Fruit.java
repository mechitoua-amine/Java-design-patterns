package design.mechitoua.patterns.behavioural.visitor.impl;

import design.mechitoua.patterns.behavioural.visitor.ShoppingCartVisitor;
import design.mechitoua.patterns.behavioural.visitor.item.Item;

public class Fruit implements Item {
    private String name;
    private int weight;
    private double pricePerKG;

    public Fruit(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.pricePerKG = price;
    }

    public String getName() {
        return name;
    }

    public double getPricePerKG() {
        return pricePerKG;
    }

    public int getWeight() {
        return weight;
    }

    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + pricePerKG +
                '}';
    }
}
