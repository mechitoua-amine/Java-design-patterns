package design.mechitoua.patterns.behavioural.command.order;

import design.mechitoua.patterns.behavioural.command.stock.Stock;

public class BuyOrder implements Order {
    private Stock stock;

    public BuyOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buyStock();
    }
}
