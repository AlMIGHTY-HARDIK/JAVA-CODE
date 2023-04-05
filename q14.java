                  //UML diagram                  
/********************************************
*                    Stock                  *
*-------------------------------------------*
* symbol: String                            *
* name: String                              *
* previousClosingPrice: double              *
* currentPrice: double                      *
* Stock(newSymbol: String, newName: String) *
* getChangePercent(): double                *
********************************************/

// Define the stock class
public class q14{//q14 -> stock
	String symbol;                 // The stock's symbol
	String name;                   // The stock's name
	double previousClosingPrice;	 // The stock price for the previous day
	double currentPrice;				 // The stock price for the current time

	// Construct a stock with a specified symbol and name
	q14(String newSymbol, String newName) {//q14 -> stock
		symbol = newSymbol;
		name = newName;
	}

	// Return the percentage changed from previousClosingPrice to currentPrice
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / 
					previousClosingPrice) * 100;
	}
}