package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of row");
		int r= FunctionalProgramming.intSample();
		System.out.println("Enter the number of column");
		int c= FunctionalProgramming.intSample();
		int arr[][] = new int[r][c];
		for(int i=0;i<r; i++)
			{
			for(int j=0;j<c; j++)
			{
				System.out.println("Enter the number");
				arr[i][j] = FunctionalProgramming.intSample();
				
			}
			}
		FunctionalProgramming.printArray(r,c,arr);
	}

}
