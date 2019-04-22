package com.bridgelabz.commercialdataprocessing.datamain;

import com.bridgelabz.commercialdataprocessing.data.StockAccountService;
import com.bridgelabz.commercialdataprocessing.dataimple.StockAccountServiceImple;
import com.bridgelabz.util.DataStructureProgramming;

public class StockAccountApp {

	public static void main(String[] args) {

		StockAccountService stockImp = new StockAccountServiceImple();
		
		
		
		{

            stockImp.createStockAccount();
		    System.out.println("Input choice");
			int input = DataStructureProgramming.getInt();
			switch (input) {
			
            case 1:
            	System.out.println("Choose a stock Company you want to buy");
    			String StockCompany=DataStructureProgramming.getString();
    			System.out.println("Enter the amount you are buying for:");
    			double sharePrice= DataStructureProgramming.getdouble();
    			stockImp.buy(StockCompany,sharePrice);
    			stockImp.save();
    			break;
    		case 2:
                System.out.println("Choose a stock Company you want to sell");
    			String SellCompany= DataStructureProgramming.getString();
    			System.out.println("Enter the amount you are selling for:");
    			double sharePrice1= DataStructureProgramming.getdouble();
    			stockImp.sell(SellCompany,sharePrice1);
    			stockImp.save();
    			break;
       	  case 3:
                stockImp.valueOf();
                break;
       	  case 4:
       		    stockImp.printReport();
       		    break;
			}

			
			
	
             
			}
	

	}

}
