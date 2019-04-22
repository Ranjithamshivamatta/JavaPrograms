package com.bridgelabz.inventory.datamain;

import java.util.Scanner;

import com.bridgelabz.inventory.data.InventoryService;
import com.bridgelabz.inventory.dataimple.InventoryServiceImple;

public class InventoryApp {
	public static void main(String[] args) {

		InventoryService inventaryImp = new InventoryServiceImple();
		{
			Scanner sc = new Scanner(System.in);
			inventaryImp.fileRead();
			System.out.println("enter name");
			String name=sc.next();
			//inv.setName(name);
			System.out.println("enter weight");
			int  weight=sc.nextInt();
			//inv.setWeight(weight);
			System.out.println("enter price");
			double price=sc.nextDouble();
			//inv.setPrice(price);
			inventaryImp.add(name, weight, price);
			inventaryImp.calculateInventory();
			inventaryImp.writeFile();
			inventaryImp.remove(name);
		}

	}
}