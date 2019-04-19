package com.bridgelabz.inventorymanagement.datamain;

import com.bridgelabz.inventorymanagement.data.InventoryManagementService;
import com.bridgelabz.inventorymanagement.dataimple.InventoryManagementServiceImple;

public class InventoryManagementApp {

	
	public static void main(String[] args)
	{
		InventoryManagementService invent = new InventoryManagementServiceImple();
		invent.calculateInventoryPrice();
	}
}
