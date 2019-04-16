package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] change = { 1, 2, 5, 10, 50, 100, 500, 1000 };
		System.out.println("enter money");
		int cash = AlgorithmProgramming.getInt();
		AlgorithmProgramming.vendingMachine(change, cash);
	}

}
