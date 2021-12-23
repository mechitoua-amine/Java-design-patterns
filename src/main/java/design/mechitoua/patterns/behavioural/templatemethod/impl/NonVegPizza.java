package design.mechitoua.patterns.behavioural.templatemethod.impl;

import design.mechitoua.patterns.behavioural.templatemethod.pizza.PizzaTemplate;

public class NonVegPizza extends PizzaTemplate {
    @Override
    public void selectBread() {
        System.out.println("selecting brown bread");
    }

    @Override
    public void addingIngredients() {
        System.out.println("adding meat balls & chicken");
    }

    @Override
    public void addingToppings() {
        System.out.println("adding toppings to Pizza");
    }
}
