package design.mechitoua.patterns.behavioural.strategy.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import design.mechitoua.patterns.behavioural.strategy.PaymentMethod;
import design.mechitoua.patterns.behavioural.strategy.product.Product;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    private int calculateTotalPrice() {
        return products.stream().map(Product::getPrice).reduce(0, Integer::sum);
    }

    public void pay(PaymentMethod paymentMethod) {
        paymentMethod.pay(calculateTotalPrice());
    }
}
