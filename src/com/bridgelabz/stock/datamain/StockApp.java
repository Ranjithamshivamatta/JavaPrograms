package com.bridgelabz.stock.datamain;

import java.util.Scanner;

import com.bridgelabz.stock.data.StockService;
import com.bridgelabz.stock.stockimple.StockServiceImple;



public class StockApp {
	

	public static void main(String[] args) {
		//String stockName = null;
		//double noOfShare = 0;
		//double sharePrice = 0;
		StockService stockImp = new StockServiceImple();

		Scanner sc = new Scanner(System.in);
	stockImp.readFile();
		System.out.println("1.Add share\n 2.Calculate each share\n 3.Total value of shares");
		System.out.println("Enter the choice: ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the name :");
			String shareName = sc.next();
			
			
			
			
		}
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
