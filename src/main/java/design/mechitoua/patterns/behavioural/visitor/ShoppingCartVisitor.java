package design.mechitoua.patterns.behavioural.visitor;

import design.mechitoua.patterns.behavioural.visitor.impl.Book;
import design.mechitoua.patterns.behavioural.visitor.impl.Fruit;

public interface ShoppingCartVisitor {
    public double visit(Book book);

    public double visit(Fruit fruit);
}
