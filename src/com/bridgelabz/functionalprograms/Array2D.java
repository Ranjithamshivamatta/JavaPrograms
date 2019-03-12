package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class Array2D {

	public static void main(String[] args) {
		System.out.println("Enter the number of row");
		int r= FunctionalProgramming.getInt();
		System.out.println("Enter the number of column");
		int c= FunctionalProgramming.getInt();
		Object arr[][] = new Object [r][c];
		
		FunctionalProgramming.printArray(r,c,arr);
	}

}

