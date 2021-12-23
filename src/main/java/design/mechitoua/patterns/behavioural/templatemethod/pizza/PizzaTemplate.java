package design.mechitoua.patterns.behavioural.templatemethod.pizza;

public abstract class PizzaTemplate {
    // Template method
    public final void preparePizza() {
        selectBread();
        addingIngredients();
        cooking();
        addingCheese();
        addingToppings();
    }

    public abstract void selectBread();

    public abstract void addingIngredients();

    public void cooking() {
        System.out.println("cooking Pizza for 15 minutes");
    }

    public void addingToppings() {
        System.out.println("adding toppings to Pizza");
    }

    public final void addingCheese() {
        System.out.println("adding cheese to Pizza");
    }
}
