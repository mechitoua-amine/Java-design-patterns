package design.mechitoua.patterns.behavioural.visitor.impl;

import design.mechitoua.patterns.behavioural.visitor.ShoppingCartVisitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public double visit(Book book) {
        double cost = 0.0;
        if (book.getPrice() > 500)
            cost = book.getPrice() - 100;
        else
            cost = book.getPrice();

        System.out.println(
                "Book Name: " + book.getName() +
                        ", Book ISBN: " + book.getIsbnNumber() +
                        ", cost: $" + cost);
        return book.getPrice();
    }

    @Override
    public double visit(Fruit fruit) {
        double cost = fruit.getPricePerKG() * fruit.getWeight();
        System.out.println(
                "Fruit Name: " + fruit.getName() +
                        ", Fruit Weight: " + fruit.getWeight() +
                        ", Fruit Price: $" + cost);

        return cost;
    }
}
