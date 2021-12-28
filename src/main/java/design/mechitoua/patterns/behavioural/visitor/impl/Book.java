package design.mechitoua.patterns.behavioural.visitor.impl;

import design.mechitoua.patterns.behavioural.visitor.ShoppingCartVisitor;
import design.mechitoua.patterns.behavioural.visitor.item.Item;

public class Book implements Item {
    private String name;
    private String isbnNumber;
    private double price;

    public Book(String name, String isbnNumber, double price) {
        this.name = name;
        this.isbnNumber = isbnNumber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public double getPrice() {
        return price;
    }

    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isbnNumber='" + isbnNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
