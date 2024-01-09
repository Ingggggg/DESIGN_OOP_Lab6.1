public class StockMarketAdapter implements CSVParser {
    private StockMarketDataParser stockMarketParser;

    public StockMarketAdapter(StockMarketDataParser stockMarketParser) {
        this.stockMarketParser = stockMarketParser;
    }

    @Override
    public void parseCSV() {
        stockMarketParser.parseFromCSV();
    }
}