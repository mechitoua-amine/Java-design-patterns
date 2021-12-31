package design.mechitoua.patterns.behavioural.command.client;

import design.mechitoua.patterns.behavioural.command.broker.StockBroker;
import design.mechitoua.patterns.behavioural.command.order.BuyOrder;
import design.mechitoua.patterns.behavioural.command.order.SellOrder;
import design.mechitoua.patterns.behavioural.command.stock.Stock;

public class Client {
    public static void main(String[] args) {
        Stock google = new Stock();
        BuyOrder buyOrder = new BuyOrder(google);
        SellOrder sellOrder = new SellOrder(google);

        StockBroker stockBroker = new StockBroker();
        stockBroker.placeOrder(buyOrder);
        stockBroker.placeOrder(sellOrder);

        stockBroker.executeOrder();
    }
}
