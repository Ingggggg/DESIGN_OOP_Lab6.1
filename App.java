public class App {
	public static void main(String[] args) {
		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();

        // Adapter pattern
        StockMarketDataParser stockMarketDataParser = new StockMarketDataParser();
        CSVParser stockMarketAdapter = new StockMarketAdapter(stockMarketDataParser);

		// parse(realEstate);
		// parse(machineLearning);
        parse(stockMarketAdapter);
	}

	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}