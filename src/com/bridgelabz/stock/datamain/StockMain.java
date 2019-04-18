package com.bridgelabz.stock.datamain;

import java.util.Scanner;

import com.bridgelabz.stock.data.StockInterface;
import com.bridgelabz.stock.stockimple.StockImplementation;



public class StockMain {
	

	public static void main(String[] args) {
		//String stockName = null;
		//double noOfShare = 0;
		//double sharePrice = 0;
		StockInterface stockImp = new StockImplementation();

		Scanner sc = new Scanner(System.in);
	stockImp.readFile();
		System.out.println("enter stockName");
		String stockName = sc.next();
		// inv.setName(name);
		System.out.println("enter noOfShare");
		int noOfShare = sc.nextInt();
		// inv.setWeight(weight);
		System.out.println("enter sharePrice");
		double sharePrice = sc.nextDouble();
		
	// inv.setPrice(price);
	   stockImp.addStock(stockName, noOfShare, sharePrice);
	    stockImp.calculateStock();
		stockImp.writeFile();
		stockImp.calculateTotalStock();
	}

}
