package design.mechitoua.patterns.behavioural.strategy.client;

import design.mechitoua.patterns.behavioural.strategy.impl.CreditCardMethod;
import design.mechitoua.patterns.behavioural.strategy.impl.PaypalMethod;
import design.mechitoua.patterns.behavioural.strategy.product.Product;
import design.mechitoua.patterns.behavioural.strategy.shoppingcart.ShoppingCart;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("Shirt", "12345", 100);
        Product product2 = new Product("Pants", "54321", 200);
        Product product3 = new Product("Shoes", "98765", 300);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);

        shoppingCart.pay(new CreditCardMethod("John Doe", "1234567890123456", "123", "12/20"));
        System.out.println("-----------------------------------------------------");

        shoppingCart = new ShoppingCart();
        product1 = new Product("milk", "12345", 20);
        product2 = new Product("bread", "54321", 5);
        product3 = new Product("chocolate", "98765", 30);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);

        shoppingCart.pay(new PaypalMethod("abc@gmail.com", "password12345"));
    }
}
