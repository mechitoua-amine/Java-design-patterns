package design.mechitoua.patterns.behavioural.command.stock;

// request object
public class Stock {
    private String stockName = "Google Share";
    private int stockQuantity = 20;

    public void buyStock() {
        System.out.println("Stock [Name: " +
                stockName + ", Quantity: " +
                stockQuantity + "] bought");
    }

    public void sellStock() {
        System.out.println("Stock [Name: " +
                stockName + ", Quantity: " +
                stockQuantity + "] sold");
    }

}
