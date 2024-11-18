public class TestStock {
    public static void main(String[] args) {
        // Create a Stock object for Oracle Corporation
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        // Set the previous closing price and the current price
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        // Display the stock symbol, name, and price change percentage
        System.out.println("Stock Symbol: " + stock.symbol);
        System.out.println("Stock Name: " + stock.name);
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");
    }
}
