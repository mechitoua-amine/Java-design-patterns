package design.mechitoua.patterns.behavioural.visitor.item;

import design.mechitoua.patterns.behavioural.visitor.ShoppingCartVisitor;

public interface Item {
    public double accept(ShoppingCartVisitor visitor);
}
