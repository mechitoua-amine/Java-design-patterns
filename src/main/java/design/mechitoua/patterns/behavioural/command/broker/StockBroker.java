package design.mechitoua.patterns.behavioural.command.broker;

// the invoker object
import java.util.ArrayList;
import java.util.List;

import design.mechitoua.patterns.behavioural.command.order.Order;

public class StockBroker {
    private List<Order> orderList = new ArrayList<>();

    public void placeOrder(Order order) {
        orderList.add(order);
    }

    public void executeOrder() {
        for (Order order : orderList) {
            order.execute();
        }

        orderList.clear();
    }

}
