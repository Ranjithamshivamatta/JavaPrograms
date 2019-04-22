package com.bridgelabz.stock.data;

public interface StockService {

	public void addStock(String stockName, double noOfShare, double sharePrice);

	public void calculateStock();

	public void readFile();

	public void writeFile();
	
	public void calculateTotalStock();
}
