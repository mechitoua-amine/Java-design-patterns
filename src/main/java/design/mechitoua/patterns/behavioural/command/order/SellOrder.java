package design.mechitoua.patterns.behavioural.command.order;

import design.mechitoua.patterns.behavioural.command.stock.Stock;

public class SellOrder implements Order {
    private Stock stock;

    public SellOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sellStock();
    }
}
