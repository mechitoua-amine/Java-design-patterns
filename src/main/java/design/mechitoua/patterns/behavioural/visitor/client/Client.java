package design.mechitoua.patterns.behavioural.visitor.client;

import java.util.ArrayList;
import java.util.List;

import design.mechitoua.patterns.behavioural.visitor.ShoppingCartVisitor;
import design.mechitoua.patterns.behavioural.visitor.impl.Book;
import design.mechitoua.patterns.behavioural.visitor.impl.Fruit;
import design.mechitoua.patterns.behavioural.visitor.impl.ShoppingCartVisitorImpl;
import design.mechitoua.patterns.behavioural.visitor.item.Item;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>(
                List.of(
                        new Book("Core Java", "ISBN-001", 25),
                        new Book("Head First Java", "ISBN-002", 35),
                        new Book("Head First Design Patterns", "ISBN-003", 40),
                        new Fruit("Apple", 10, 5.6),
                        new Fruit("Orange", 20, 6.5),
                        new Fruit("Grapes", 30, 7.2)));

        double totalcost = calculateTotalCost(items);
        System.out.println("Total cost of items is $" + totalcost);
    }

    private static double calculateTotalCost(List<Item> items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double totalCost = 0.0;
        totalCost = items.stream()
                .map(item -> item.accept(visitor))
                .reduce(totalCost, Double::sum);
        return totalCost;
    }
}
