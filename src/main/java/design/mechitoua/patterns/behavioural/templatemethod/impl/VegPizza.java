package design.mechitoua.patterns.behavioural.templatemethod.impl;

import design.mechitoua.patterns.behavioural.templatemethod.pizza.PizzaTemplate;

public class VegPizza extends PizzaTemplate {
    @Override
    public void selectBread() {
        System.out.println("selecting white bread");
    }

    @Override
    public void addingIngredients() {
        System.out.println("adding vegetables");
    }
}
