package design.mechitoua.patterns.behavioural.templatemethod.client;

import design.mechitoua.patterns.behavioural.templatemethod.impl.NonVegPizza;
import design.mechitoua.patterns.behavioural.templatemethod.impl.VegPizza;
import design.mechitoua.patterns.behavioural.templatemethod.pizza.PizzaTemplate;

public class Client {
    public static void main(String[] args) {
        System.out.println("---------------- Non Vegetable Pizza -----------------");
        PizzaTemplate pizzaTemplate = new NonVegPizza();
        pizzaTemplate.preparePizza();
        System.out.println("----------------- Vegetable Pizza ----------------");
        PizzaTemplate pizzaTemplate2 = new VegPizza();
        pizzaTemplate2.preparePizza();
    }
}
