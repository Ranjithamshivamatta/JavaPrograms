package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class PrimeRange {

	public static void main(String[] args) {

		System.out.println("Enter the starting no");
		int startnum = AlgorithmProgramming.getInt();
		System.out.println("Enter the ending no");
		int endnum = AlgorithmProgramming.getInt();
		AlgorithmProgramming.primeRange(startnum, endnum);
	}

}
