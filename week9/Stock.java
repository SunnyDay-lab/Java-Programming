public class Stock {
    // Data fields
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    // Constructor to initialize Stock object with symbol and name
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Method to set the previous closing price
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // Method to set the current price
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Method to get the percentage change between previous closing price and current price
    public double getChangePercent() {
        if (previousClosingPrice == 0) {
            return 0; // Avoid division by zero if previousClosingPrice is 0
        }
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
